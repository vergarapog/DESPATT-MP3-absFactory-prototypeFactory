package utility.prototype.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//this class is a holder of a connection object, and this class can be cloned by implementing cloneable connection
public class CloneableConnectionHolder implements CloneableConnection {
		
	private final Connection connection = this.getConnection();
	
	@Override
    public CloneableConnection clone() {
        return new CloneableConnectionHolder();
    }
	
	
	@Override
	public Connection getMyConnection() {
		return connection;
	}


	private Connection getConnection() {
		Connection connection = null;

		try {
			
			connection = ((DataSource) InitialContext.doLookup("java:/comp/env/jdbc/SEG31_DS")).getConnection();
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return connection;
		
		
	}
	
	
	  

}
