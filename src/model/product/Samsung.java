package model.product;

import model.accessory.*;

public class Samsung extends Product{
	
	private Accessory accessory;
	
	public Samsung() {
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
		this.prodName = "Samsung Galaxy S21 Ultra";
	}

	@Override
	public void setImgSrc1() {
		// TODO Auto-generated method stub
		this.imgSrc1 = "images/samsung/samsung2.jpg";
	}

	@Override
	public void setImgSrc2() {
		// TODO Auto-generated method stub
		this.imgSrc2 = "images/samsung/samsung1.jpg";

	}

	@Override
	public void setImgSrc3() {
		// TODO Auto-generated method stub
		this.imgSrc3 = "images/samsung/samsung3.jpg";

	}

	@Override
	public void setImgSrc4() {
		// TODO Auto-generated method stub
		this.imgSrc4 = "images/samsung/samsung4.jpg";

	}

	@Override
	public void setPrice() {
		this.price = 80000;
	}

	@Override
	public void setShortDesc() {
		// TODO Auto-generated method stub
		this.shortDesc = 
				"Introducing Galaxy S21 Ultra 5G. Designed with a unique contour-cut camera to create a revolution in photography, letting you capture cinematic 8K video and snap epic stills, all in one go. And with Galaxy's fastest chip, strongest glass, 5G and an all-day battery, Ultra easily lives up to its name.";
		
	}

	@Override
	public void setDisplay() {
		// TODO Auto-generated method stub
		this.display = "Samsung AMOLED 120Hz";
	}

	@Override
	public void setCameras() {
		// TODO Auto-generated method stub
		this.cameras = "16mp Ultrawide Lens, 108mp Main Lens, 64mp Zoom Lens";
	}

	@Override
	public void setCpu() {
		// TODO Auto-generated method stub
		this.cpu = "Snapdragon 888";
	}

	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		this.ram = "16gb RAM";
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
