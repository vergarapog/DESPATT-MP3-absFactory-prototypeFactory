package model.searchResultHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.accessory.*;
import model.product.*;
import utility.AccessoryFactory;
import utility.ProductFactory;
import utility.prototype.db.*;


public class SearchResults implements DBOps {
	
	private ArrayList<Product> foundProducts;
	private ResultSet rs;
	
	public SearchResults() {
		this.foundProducts = new ArrayList<>();
	}
	
	private Connection getClonedConnection() {
		
		//gets a clone of a CloneableCOnnectionHolder where inside is a connection object
		CloneableConnection myCon = ConnectionPrototypeFactory.getPrototype("CloneableConnectionHolder");
		
		//gets the connection object from the holder
		return myCon.getMyConnection();
		
	}
	
	public void getSearchedProducts(String search) {
		
		try {
			
			System.out.println("inside search class");
			
			Connection con = this.getClonedConnection();
			
			PreparedStatement pstmnt = con.prepareStatement(SEARCH);
			pstmnt.setString(1, "%" + search + "%");
			pstmnt.setString(2, "%" + search + "%");
			
			this.rs = pstmnt.executeQuery();
			
			
			
		} catch (SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
		
		try {
			while(rs.next()) {
				Product product = new ProductFactory().getProduct(rs.getString(1).toUpperCase());
				Accessory accessory = new AccessoryFactory().getAccessory(rs.getString(1).toUpperCase());
				
				product.setAccessory(accessory);
				
				this.foundProducts.add(product);
				
				System.out.println(foundProducts.size());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isListEmpty() {
		
		if(this.foundProducts.size() == 0) {
			System.out.println("array empty");
			return true;
			
		} else {
			
			return false;
			
		}
		
		
	}
	
	public String displayResults() {
		
		String searchResults = "";
		
		for(Product prod : foundProducts) {
			
			searchResults += "\n<div class=\"container\">\r\n" + 
					"			<div class=\"card\">\r\n" + 
					"\r\n" + 
					"				<div class=\"card-body\">\r\n" + 
					"\r\n" + 
					"				<h3 class=\"card-title\">"+ prod.getProdName()+"</h3>\r\n" + 
					"                  <img src="+ prod.getImgSrc1()+" width =\"250\" height=\"250\"> "+
					"				\r\n" + 
					"				<div class=\"col-12\">\r\n" + 
					"					\r\n" + 
					"<hr>\r\n" + 
					"				\r\n" + 
					"					<div class=\"row\">\r\n" + 
					"					<p style=\"font-weight: bold\">"+ prod.getShortDesc() + 
					
					"					</div>\r\n" + 
					"					<br>\r\n" + 
					"					<a href=\"index.jsp\" class=\"btn btn-primary\" style=\"margin-left: -1em;\">Back</a>\r\n" + 
					"						\r\n" + 
					"<form action=\"processproduct.action\" method=\"post\">\r\n" + 
					"\r\n" + 
					" <input type=\"hidden\" name=\"prodName\" value="+ prod.getBrand()+" />" +
					"<br>" +
					"                    <input type=\"submit\" value=\"See Details\" id=\"cta-btn\">\r\n" + 
					"                </form>" +
					"					</div>\r\n" + 
					"				 </div>\r\n" + 
					"			</div>\r\n" + 
					"		</div>";
			
		}
		
		return searchResults;
		
		
	}
	
	
	
	

}
