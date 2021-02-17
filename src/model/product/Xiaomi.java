package model.product;

import model.accessory.*;

public class Xiaomi extends Product {
	
	private Accessory accessory;
	
	public Xiaomi() {
		this.setProdName();
		this.setImgSrc1();
		this.setImgSrc2();
		this.setImgSrc3();	
		this.setImgSrc4();
		this.setPrice();
		this.setShortDesc();
		this.setDisplay();
		this.setCameras();
		this.setCpu();
		this.setRam();
		this.setSecMemory();
		
		
		
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
	public void setProdName() {
		this.prodName = "Xiaomi MI10T Ultra";
	}

	@Override
	public void setImgSrc1() {
		// TODO Auto-generated method stub
		this.imgSrc1 = "images/xiaomi/xiaomi2.jpg";
	}

	@Override
	public void setImgSrc2() {
		// TODO Auto-generated method stub
		this.imgSrc2 = "images/xiaomi/xiaomi1.jpg";

	}

	@Override
	public void setImgSrc3() {
		// TODO Auto-generated method stub
		this.imgSrc3 = "images/xiaomi/xiaomi3.jpg";

	}

	@Override
	public void setImgSrc4() {
		// TODO Auto-generated method stub
		this.imgSrc4 = "images/xiaomi/xiaomi4.jpg";

	}

	@Override
	public void setPrice() {
		this.price = 55000;
	}

	@Override
	public void setShortDesc() {
		// TODO Auto-generated method stub
		this.shortDesc = 
				"The Mi 10T Ultra series sets the benchmark for next-generation performance.\r\n" + 
				"Experience extreme power and efficiency with the latest LPDDR5 RAM and UFS 3.0 ROM technology, powered by the Qualcomm® Snapdragon 865 platform.\r\n" + 
				"Whether at work or play, expect to have your expectations surpassed.";
		
	}

	@Override
	public void setDisplay() {
		// TODO Auto-generated method stub
		this.display = "AMOLED 120Hz";
	}

	@Override
	public void setCameras() {
		// TODO Auto-generated method stub
		this.cameras = "16mp Ultrawide Lens, 108mp Main Lens, 64mp Zoom Lens, 10mp Macro Lens";
	}

	@Override
	public void setCpu() {
		// TODO Auto-generated method stub
		this.cpu = "Snapdragon 865";
	}

	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		this.ram = "12gb RAM";
	}

	@Override
	public void setSecMemory() {
		// TODO Auto-generated method stub
		this.secMemory = "256gb Memory";
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

}
