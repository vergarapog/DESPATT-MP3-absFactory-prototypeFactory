package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utility.prototype.db.*;

public class DbInitializeHelper implements DBOps {
	
	Connection con;
	
	public DbInitializeHelper(CloneableConnection con) {
		this.con = con.getMyConnection();
	}
	
	public void createTables() {
		
		try {
			Connection con = this.con;
			
			PreparedStatement pstmt = con.prepareStatement(CREATE_TABLE_PRODUCT);
			pstmt.executeUpdate();
			
			System.out.println("Table created 1");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Connection con = this.con;
			
			PreparedStatement pstmt = con.prepareStatement(CREATE_TABLE_ACCESSORY);
			pstmt.executeUpdate();
			
			
			System.out.println("Table created 2");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	
	
	

}
