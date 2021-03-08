package model.accessory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utility.prototype.db.*;
public class XiaomiAccessory extends Accessory implements DBOps {
	
	public XiaomiAccessory() {
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
			PreparedStatement pstmnt = con.prepareStatement(GET_ACCESSORY);
			pstmnt.setString(1, "%" + "xiaomi" + "%");
			
			rs = pstmnt.executeQuery();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
		try {
			while(rs.next()) {
				this.prodName = rs.getString(2);
				this.stockQty = rs.getInt(5);
				this.imgSrc1 = rs.getString(6);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	@Override
	public String getAccsProdName() {
		// TODO Auto-generated method stub
		return prodName;
	}

	@Override
	public String getAccsImgSrc1() {
		// TODO Auto-generated method stub
		return imgSrc1;
	}
	
	@Override
	public int stockQty() {
		// TODO Auto-generated method stub
		return stockQty;
	}


}
