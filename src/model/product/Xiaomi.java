package model.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.accessory.*;
import utility.AccessoryFactory;
import utility.ProductFactory;
import utility.prototype.db.*;

public class Xiaomi extends Product implements DBOps {
	
	private Accessory accessory;
	
	public Xiaomi() {
	
		this.setDetails();
		
		
	}
	
private Connection getClonedConnection() {
		
		CloneableConnection myCon = ConnectionPrototypeFactory.getPrototype("CloneableConnectionHolder");
		
		return myCon.getMyConnection();
		
	}
	
	@Override
	public void setDetails() {
		
		ResultSet rs = null;
		
		try {
			Connection con = this.getClonedConnection();
			PreparedStatement pstmnt = con.prepareStatement(GET_PRODUCT);
			pstmnt.setString(1, "%" + "xiaomi" + "%");
			
			rs = pstmnt.executeQuery();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
		try {
			while(rs.next()) {
				this.prodName = rs.getString(2);
				this.brand = rs.getString(3);
				this.imgSrc1 = rs.getString(5);
				this.imgSrc2 = rs.getString(6);
				this.imgSrc3 = rs.getString(7);
				this.imgSrc4 = rs.getString(8);
				this.price = rs.getDouble(9);
				this.stockQty = rs.getInt(10);
				this.shortDesc = rs.getString(11);
				this.display = rs.getString(12);
				this.cameras = rs.getString(13);
				this.cpu = rs.getString(14);
				this.ram = rs.getString(15);
				this.secMemory = rs.getString(16);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public  void setAccessory(Accessory accessory) {
		this.accessory = accessory;
	}
	
	@Override
	public Accessory getAccesory() {
		return accessory;
	}
	
	@Override
	public String getAccsProdName() {
		return this.accessory.getAccsProdName();//gets accessory name
	
	}
	
	@Override
	public String getAccsImgSrc1() {
		return this.accessory.getAccsImgSrc1(); //gets accessory image
	}
	

	

	@Override
	public String getProdName() {
		// TODO Auto-generated method stub
		return prodName;
	}

	@Override
	public String getImgSrc1() {
		// TODO Auto-generated method stub
		return imgSrc1;
	}

	@Override
	public String getImgSrc2() {
		// TODO Auto-generated method stub
		return imgSrc2;
	}

	@Override
	public String getImgSrc3() {
		// TODO Auto-generated method stub
		return imgSrc3;
	}

	@Override
	public String getImgSrc4() {
		// TODO Auto-generated method stub
		return imgSrc4;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	@Override
	public int getStockQty() {
		// TODO Auto-generated method stub
		return stockQty;
	}

	@Override
	public String getShortDesc() {
		// TODO Auto-generated method stub
		return shortDesc;
	}

	@Override
	public String getDisplay() {
		// TODO Auto-generated method stub
		return display;
	}

	@Override
	public String getCameras() {
		// TODO Auto-generated method stub
		return cameras;
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getSecMemory() {
		// TODO Auto-generated method stub
		return secMemory;
	}
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}
	
	

}
