package model.shoppingcartandpayments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import model.product.Product;
import utility.prototype.db.*;

public class CheckoutHelper implements DBOps {
	
	private Cart cart;
	private BillingInfo billInfo;
	
	public CheckoutHelper(Cart cart, BillingInfo billInfo) {
		this.cart = cart;
		this.billInfo = billInfo;
	}
	
	public void process() {
		this.insertOrder();
		//will only reduce qty after checking luhn in checkoutservlet
		this.reduceQty(); 
		this.createPdf();
		this.sendEmail();
	}
	
	private Connection getClonedConnection() {
		
		//gets a clone of a CloneableCOnnectionHolder where inside is a connection object
		CloneableConnection myCon = ConnectionPrototypeFactory.getPrototype("CloneableConnectionHolder");
		
		//gets the connection object from the holder
		return myCon.getMyConnection();
		
	}
	
	public boolean luhnCheck() {
		if(billInfo.checkLuhn(billInfo.getCreditCardNum())){
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean insertOrder() {
		boolean isSuccessful = false;
		Connection connection = getClonedConnection();
		
		if (connection != null) {
			try {
				connection.setAutoCommit(false); //start of transaction
				PreparedStatement pstmnt = connection.prepareStatement(INSERT_ORDER);
				
				pstmnt.setString(1, billInfo.getNameOnCard());
				//pstmnt.setString(1, this.id);
				pstmnt.setInt(2, cart.getSize());
				//pstmnt.setString(2, this.name);
				pstmnt.setDouble(3, cart.calculateTotal());
				pstmnt.setString(4, billInfo.getCreditCardNum());

				
				pstmnt.executeUpdate();
				connection.commit();
				isSuccessful = true;
			} catch (SQLException sqle) {
				try {
					connection.rollback();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				sqle.printStackTrace();
			}
		} 
		return isSuccessful;
		
	}
	
	public void reduceQty() {
		HashSet<Product> products = cart.getCartList();
	
		
		for(Product p : products) {
			try {
				
				System.out.println("inside deduct func");
				
				Connection con = this.getClonedConnection();
				
				PreparedStatement pstmnt = con.prepareStatement(DEDUCT_QTY);
				pstmnt.setString(1, p.getBrand());
				
				
				pstmnt.executeUpdate();
				
				
				
			} catch (SQLException sqle) {
				
				sqle.printStackTrace();
			}
		}
		
	}
	
	public void createPdf() {
		
		String path = System.getProperty("user.dir");
		String file_name = "C:\\Users\\admin\\Desktop\\addtocart-receipt.pdf";
		Document document = new Document();
		
		HashSet<Product> products = cart.getCartList();
		String text = "";
		
		for(Product p : products) {
			text += "\n" + p.getProdName() + " -  " +  p.getPrice() + "  -   1" + "\n ------------------"; 
		}
		
		try {
			
			File desktopDir = new File(System.getProperty("user.home"), "Desktop");// get dynamic path of desktop
			System.out.println(desktopDir.getPath() + " " + desktopDir.exists());
			String pathToDesktop = desktopDir.getPath();
			
			PdfWriter.getInstance(document, new FileOutputStream(new File(desktopDir, "addtocart-receipt.pdf")));
			
			document.open();
			
			Paragraph header = new Paragraph( "Add to Cart Official Receipt");
			
			Paragraph header2 = new Paragraph( "Product Name    -    Price    -    Qty");
			
			Paragraph paraProduct = new Paragraph(text);
			
			Paragraph name = new Paragraph( "\n\n\n-------------\nCustomer: " + billInfo.getNameOnCard());
			
			document.add(header);
			
			document.add(header2);
			
			document.add(paraProduct);
			
			document.add(name);
			
			document.close();
			
			System.out.println("receipt printed");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void sendEmail() {
		
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		String email = "bscsmail.se31@gmail.com";
		String password = "BSCS-SE31";
		
		String fromEmail = "bscsmail.se31@gmail.com";
		String toEmail = "bscsmail.se31@gmail.com";
		
		Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication(email, password);
				}
		});
		
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(fromEmail));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			msg.setSubject("AddtoCart purchase");
			
			Multipart emailContent = new MimeMultipart();
			
			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText("Thank you for shopping with add to cart!");
			
			MimeBodyPart pdfAttach = new MimeBodyPart();
			File desktopDir = new File(System.getProperty("user.home"), "Desktop"); //to get dynamic path of desktop
			System.out.println(desktopDir.getPath() + " " + desktopDir.exists());
			String pathToDesktop = desktopDir.getPath();
			pdfAttach.attachFile(desktopDir + "\\addtocart-receipt.pdf");
			
			emailContent.addBodyPart(textBodyPart);
			emailContent.addBodyPart(pdfAttach);

			msg.setContent(emailContent);
			
			Transport.send(msg);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	

}
