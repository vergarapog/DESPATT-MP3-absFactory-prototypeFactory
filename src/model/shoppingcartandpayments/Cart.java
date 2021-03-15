package model.shoppingcartandpayments;

import java.io.Serializable;

import java.util.HashSet;

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

public class Cart implements Serializable, DBOps {
	
	private HashSet<Product> products; //Hashset because only one device per brand per customer
	private double totalPrice;
	
	

		
		
	public Cart() {
		this.products = new HashSet<>();
	}
	
	private Connection getClonedConnection() {
		
		//gets a clone of a CloneableCOnnectionHolder where inside is a connection object
		CloneableConnection myCon = ConnectionPrototypeFactory.getPrototype("CloneableConnectionHolder");
		
		//gets the connection object from the holder
		return myCon.getMyConnection();
		
	}
	
	public void addItem(String brandName) {
		
		System.out.println(brandName);
		Product product = new ProductFactory().getProduct(brandName.toUpperCase());
		Accessory accessory = new AccessoryFactory().getAccessory(brandName.toUpperCase());
		
		product.setAccessory(accessory);
		
		
		
		if(product.getBrand().equalsIgnoreCase("apple")) {
			Apple apple = (Apple) product;
			this.products.add(apple);
		} else if (product.getBrand().equalsIgnoreCase("samsung")) {
			Samsung samsung = (Samsung) product;
			this.products.add(samsung);
		} else if (product.getBrand().equalsIgnoreCase("xiaomi")) {
			Xiaomi xiaomi = (Xiaomi) product;
			this.products.add(xiaomi);
		}
		
		
		//this.products.add(product);
		
		
		
	}
	
	public HashSet<Product> getCartList(){
		return this.products;
	}
	
	public void checkSize() {
		System.out.println(products.size());
	}
	
	public int getSize() {
		return products.size();
	}
	
	public void removeItem(String brand) {
		
//		for(Product p : products) {
//			if(p.getBrand().equalsIgnoreCase(brand)) {
//				this.products.remove(p);
//			}
//		}
		
		ArrayList<Product> toRemove = new ArrayList<Product>();
		for (Product p : products) {
		    if (p.getBrand().equalsIgnoreCase(brand)) {
		        toRemove.add(p);
		    }
		}
		
		products.removeAll(toRemove);
		
	}
	
	public void clearCart() {
		this.products.clear();
		
	}
	
	public double calculateTotal() {
		double sum = 0;
		
		for(Product p : products) {
			
			sum += p.getPrice();
			
		}
		
		this.totalPrice = sum;
		
		return sum;
	}
	
	public boolean isEmpty() {
		if(products.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public String displayCart() {
		
		String cartContents = "";
		
		for(Product p : products) {
			cartContents += "<tr>\r\n" + 
					"                            <td><img src=" + p.getImgSrc1() +" width=\"120px\" height=\"150px\" /> </td> \r\n" + 
					"                            <td> "+ p.getProdName() +"</td>\r\n" + 
					"                            <td>In stock</td>\r\n" + 
					"                            <td>1 * only one device per brand per customer</td>\r\n" + 
					"                            <td class=\"text-right\"> "+ p.getPrice() +"</td>\r\n" + 
					"                            <td class=\"text-right\">"
					+ "<form action=\"removefromcart.action\" method=\"post\">"
					+ "<input type=\"hidden\" name=\"brand\" id=\"brand\" value= "+ p.getBrand() +">"
					+ "<button type=\"submit\" class=\"btn btn-sm btn-danger\"><i class=\"fa fa-trash\"></i> </button> </td>\r\n"
					+ "</form>" + 
					"                      </tr>";
		}
		
		
		return cartContents;
	}
	
	public String displayTotal() {
		
		
			String cartContents = "<tr>\r\n" + 
					"                            <td></td>\r\n" + 
					"                            <td></td>\r\n" + 
					"                            <td></td>\r\n" + 
					"                            <td></td>\r\n" + 
					"                            <td><strong>Total</strong></td>\r\n" + 
					"                            <td class=\"text-right\"> "+ this.calculateTotal() + "</td>\r\n" + 
					"                        </tr>";
		
		
		
		return cartContents;
	}
		
		
	

}
