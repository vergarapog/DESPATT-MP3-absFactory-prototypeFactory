package utility.prototype.db;

import java.sql.Connection;

public interface CloneableConnection {
	
	CloneableConnection clone();
	
	Connection getMyConnection();

}
