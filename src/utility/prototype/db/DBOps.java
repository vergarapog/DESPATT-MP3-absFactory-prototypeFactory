package utility.prototype.db;

public interface DBOps {
	
	String INSERT_RECORD = "insert into vehiclecoding (busName, plateNumber, "
			+ "driver, codingDayAssigned) values (?,?,?,?)";
	
	
	String CREATE_TABLE_PRODUCT = "CREATE TABLE IF NOT EXISTS `product` (\r\n" + 
			" `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
			" `prodName` varchar(255) NOT NULL,\r\n" + 
			" `imgMain` varchar(80) NOT NULL,\r\n" + 
			" `imgSrc1` varchar(90) NOT NULL,\r\n" + 
			" `imgSrc2` varchar(90) NOT NULL,\r\n" + 
			" `imgSrc3` varchar(90) NOT NULL,\r\n" + 
			" `imgSrc4` varchar(90) NOT NULL,\r\n" + 
			" `price` double NOT NULL,\r\n" + 
			" `shortDesc` varchar(800) NOT NULL,\r\n" + 
			" `display` varchar(255) NOT NULL,\r\n" + 
			" `cameras` varchar(255) NOT NULL,\r\n" + 
			" `cpu` varchar(255) NOT NULL,\r\n" + 
			" `ram` varchar(255) NOT NULL,\r\n" + 
			" `secMemory` varchar(255) NOT NULL,\r\n" + 
			" PRIMARY KEY (`id`)\r\n" + 
			") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
	
	String CREATE_TABLE_ACCESSORY = "CREATE TABLE IF NOT EXISTS `accessory` (\r\n" + 
			" `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
			" `prodName` varchar(80) NOT NULL,\r\n" + 
			" `price` double NOT NULL,\r\n" + 
			" `imgSrc1` varchar(80) NOT NULL,\r\n" + 
			" PRIMARY KEY (`id`)\r\n" + 
			") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";

}
