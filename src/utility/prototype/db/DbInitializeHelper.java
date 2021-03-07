package utility.prototype.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbInitializeHelper implements DBOps {
	
	
	
	public DbInitializeHelper() {
		
	}
	
	private Connection getClonedConnection() {
		
		CloneableConnection myCon = ConnectionPrototypeFactory.getPrototype("CloneableConnectionHolder");
		
		return myCon.getMyConnection();
		
	}
	
	public void createTables() {
		
		try {
			Connection con = this.getClonedConnection();
			
			PreparedStatement pstmt = con.prepareStatement(CREATE_TABLE_PRODUCT);
			pstmt.executeUpdate();
			
			System.out.println("Table created 1");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Connection con = this.getClonedConnection();
			
			PreparedStatement pstmt = con.prepareStatement(CREATE_TABLE_ACCESSORY);
			pstmt.executeUpdate();
			
			
			System.out.println("Table created 2");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void populateProducts() {
		
		try {
			Connection con = this.getClonedConnection();
			PreparedStatement pstmnt = con.prepareStatement(ALL_PRODUCTS);
			
			pstmnt.executeUpdate();
			
		} catch (SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
	}
	
	public void populateAccessories() {
		
		try {
			Connection con = this.getClonedConnection();
			PreparedStatement pstmnt = con.prepareStatement(ALL_ACCESSORIES);
			
			pstmnt.executeUpdate();
			
		} catch (SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
	}
	
	public void dropDB() {
		
		try {
			Connection con = this.getClonedConnection();
			PreparedStatement pstmnt = con.prepareStatement(DELETE_DB);
			System.out.println("drop db success");
			
			
			pstmnt.executeUpdate();
			
		} catch (SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
	}
	
	
	
	
	

}
