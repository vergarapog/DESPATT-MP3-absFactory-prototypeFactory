package utility.prototype.db;

public interface DBOps {
	
	String INSERT_RECORD = "insert into vehiclecoding (busName, plateNumber, "
			+ "driver, codingDayAssigned) values (?,?,?,?)";
	
	
	String CREATE_TABLE_PRODUCT = "CREATE TABLE IF NOT EXISTS `product` (\r\n" + 
			" `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
			" `prodName` varchar(255) NOT NULL,\r\n" + 
			" `brandName` varchar(255) NOT NULL,\r\n" + 
			" `imgMain` varchar(80) NOT NULL,\r\n" + 
			" `imgSrc1` varchar(90) NOT NULL,\r\n" + 
			" `imgSrc2` varchar(90) NOT NULL,\r\n" + 
			" `imgSrc3` varchar(90) NOT NULL,\r\n" + 
			" `imgSrc4` varchar(90) NOT NULL,\r\n" + 
			" `price` double NOT NULL,\r\n" + 
			" `stockQty` int NOT NULL,\r\n" + 
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
			" `brandName` varchar(80) NOT NULL,\r\n" + 
			" `price` double NOT NULL,\r\n" + 
			" `stockQty` int NOT NULL,\r\n" + 
			" `imgSrc1` varchar(80) NOT NULL,\r\n" + 
			" PRIMARY KEY (`id`)\r\n" + 
			") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
	
	String DELETE_DB = "DROP TABLE IF EXISTS product, accessory";
	
	String SEARCH = "SELECT brandName FROM product WHERE prodName LIKE ? OR shortDesc LIKE ?";
	
	String GET_PRODUCT = "SELECT * FROM product WHERE prodName LIKE ?";
	
	String GET_ACCESSORY = "SELECT * FROM accessory WHERE prodName LIKE ?";
	
	// I could have done the insertion below better by using the factories or getting them from a text file, but I found 
	//another use for the factories, I hope this would do for now
	String ALL_PRODUCTS = "INSERT INTO PRODUCT(\r\n" + 
			"    prodName,\r\n" + 
			"    brandName,\r\n" + 
			"    imgMain,\r\n" + 
			"    imgSrc1,\r\n" + 
			"    imgSrc2,\r\n" + 
			"    imgSrc3,\r\n" + 
			"    imgSrc4,\r\n" + 
			"    price,\r\n" + 
			"    stockQty,\r\n" + 
			"    shortDesc,\r\n" + 
			"    display,\r\n" + 
			"    cameras,\r\n" + 
			"    CPU,\r\n" + 
			"    ram,\r\n" + 
			"    secMemory\r\n" + 
			")\r\n" + 
			"VALUES(\r\n" + 
			"    'Apple iPhone 12 Pro Max',\r\n" + 
			"    'apple',\r\n" + 
			"    'images/apple2.png',\r\n" + 
			"    'images/apple/apple1.jpg',\r\n" + 
			"    'images/apple/apple2.jpg',\r\n" + 
			"    'images/apple/apple3.jpg', \r\n" + 
			"    'images/apple/apple4.jpg',\r\n" + 
			"    70000,\r\n" + 
			"    100,\r\n" + 
			"    '5G goes Pro. A14 Bionic rockets past every other smartphone chip. The Pro camera system takes low-light photography to the next level, with an even bigger jump on iPhone 12 Pro Max. And Ceramic Shield delivers four times better drop performance.',\r\n" + 
			"    'Super Retina Display XDR 60Hz',\r\n" + 
			"    '16mp Ultrawide Lens 12mp Main Lens 16mp Zoom Lens',\r\n" + 
			"    'Apple A14 Bionic',\r\n" + 
			"    '6gb RAM',\r\n" + 
			"    '256gb Memory'\r\n" + 
			"), (\r\n" + 
			"    'Samsung Galaxy S21 Ultra',\r\n" + 
			"    'samsung',\r\n" + 
			"    'images/samsung3.png',\r\n" + 
			"    'images/samsung/samsung2.jpg',\r\n" + 
			"    'images/samsung/samsung1.jpg',\r\n" + 
			"    'images/samsung/samsung3.jpg', \r\n" + 
			"    'images/samsung/samsung4.jpg',\r\n" + 
			"    80000,\r\n" + 
			"    100,\r\n" + 
			"    'Introducing Galaxy S21 Ultra 5G. Designed with a unique contour-cut camera to create a revolution in photography, letting you capture cinematic 8K video and snap epic stills, all in one go. And with the fastest Galaxy chip, strongest glass, 5G and an all-day battery, Ultra easily lives up to its name.',\r\n" + 
			"    'Samsung AMOLED 120Hz',\r\n" + 
			"    '16mp Ultrawide Lens, 108mp Main Lens, 64mp Zoom Lens',\r\n" + 
			"    'Snapdragon 888',\r\n" + 
			"    '16gb RAM',\r\n" + 
			"    '256gb Memory'\r\n" + 
			"), (\r\n" + 
			"    'Xiaomi MI10T Ultra',\r\n" + 
			"    'xiaomi',\r\n" + 
			"    'images/xiaomi2.png',\r\n" + 
			"    'images/xiaomi/xiaomi2.jpg',\r\n" + 
			"    'images/xiaomi/xiaomi1.jpg',\r\n" + 
			"    'images/xiaomi/xiaomi3.jpg', \r\n" + 
			"    'images/xiaomi/xiaomi4.jpg',\r\n" + 
			"    55000,\r\n" + 
			"    100,\r\n" + 
			"    'The Mi 10T Ultra series sets the benchmark for next-generation performance.\\r\\n\" + \r\n" + 
			"				\"Experience extreme power and efficiency with the latest LPDDR5 RAM and UFS 3.0 ROM technology, powered by the Qualcomm® Snapdragon 865 platform.\\r\\n\" + \r\n" + 
			"				\"Whether at work or play, expect to have your expectations surpassed.',\r\n" + 
			"    'AMOLED 120Hz',\r\n" + 
			"    '16mp Ultrawide Lens, 108mp Main Lens, 64mp Zoom Lens, 10mp Macro Lens',\r\n" + 
			"    'Snapdragon 865',\r\n" + 
			"    '12gb RAM',\r\n" + 
			"    '256gb Memory'\r\n" + 
			")";
	
	String ALL_ACCESSORIES = "INSERT INTO accessory(`prodName`, `brandName`, `price`, `stockQty`, `imgSrc1`)\r\n" + 
			"VALUES(\r\n" + 
			"    'Apple Airpods Pro',\r\n" + 
			"    'apple',\r\n" + 
			"    '15000',\r\n" + 
			"    100,\r\n" + 
			"    'images/accessories/apple/appleaccs.jpg'\r\n" + 
			"), (\r\n" + 
			"	'Samsung Galaxy Buds',\r\n" + 
			"    'samsung',\r\n" + 
			"    '10000',\r\n" + 
			"    100,\r\n" + 
			"    'images/accessories/samsung/samsungaccs2.jpg'\r\n" + 
			"), (\r\n" + 
			"	'Xiaomi Free Buds',\r\n" + 
			"    'xiaomi',\r\n" + 
			"    '5000',\r\n" + 
			"    100,\r\n" + 
			"    'images/accessories/xiaomi/xiaomiaccs.jpg\'\r\n" + 
			")";
	
	
	
	
	

}
