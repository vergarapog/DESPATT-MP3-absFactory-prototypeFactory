package model.product;

import model.accessory.*;

public class Apple extends Product {
	
	private Accessory accessory;
	
	public Apple() {
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
		this.prodName = "iPhone 12 Pro Max";
	}

	@Override
	public void setImgSrc1() {
		// TODO Auto-generated method stub
		this.imgSrc1 = "images/apple/apple1.jpg";
	}

	@Override
	public void setImgSrc2() {
		// TODO Auto-generated method stub
		this.imgSrc2 = "images/apple/apple2.jpg";

	}

	@Override
	public void setImgSrc3() {
		// TODO Auto-generated method stub
		this.imgSrc3 = "images/apple/apple3.jpg";

	}

	@Override
	public void setImgSrc4() {
		// TODO Auto-generated method stub
		this.imgSrc4 = "images/apple/apple4.jpg";

	}

	@Override
	public void setPrice() {
		this.price = 70000;
	}

	@Override
	public void setShortDesc() {
		// TODO Auto-generated method stub
		this.shortDesc = 
				"5G goes Pro. A14 Bionic rockets past every other smartphone chip. The Pro camera system takes low-light photography to the next level, with an even bigger jump on iPhone 12 Pro Max. And Ceramic Shield delivers four times better drop performance.";
		
	}

	@Override
	public void setDisplay() {
		// TODO Auto-generated method stub
		this.display = "Super Retina Display XDR 60Hz";
	}

	@Override
	public void setCameras() {
		// TODO Auto-generated method stub
		this.cameras = "16mp Ultrawide Lens, 12mp Main Lens, 16mp Zoom Lens";
	}

	@Override
	public void setCpu() {
		// TODO Auto-generated method stub
		this.cpu = "Apple A14 Bionic";
	}

	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		this.ram = "6gb RAM";
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
