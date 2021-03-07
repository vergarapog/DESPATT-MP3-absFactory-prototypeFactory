package model.product;

import model.accessory.*;


import java.io.Serializable;

public abstract class Product implements Serializable {

	protected String prodName;
	protected String brand;
	protected String imgSrc1;
	protected String imgSrc2;
	protected String imgSrc3;
	protected String imgSrc4;
	protected double price;
	
	protected String shortDesc;
	
	//prod specifications
	protected String display;
	protected String cameras;
	protected String cpu;
	protected String ram;
	protected String secMemory;
	
	public abstract void setAccessory(Accessory accessory);
	public abstract Accessory getAccesory();
	
	//one setter for database transaction
	public abstract void setDetails();
	
	
	
	//getters for jsp UseBean
	public abstract String getProdName();
	public abstract String getBrand();
	public abstract String getImgSrc1();
	public abstract String getImgSrc2();
	public abstract String getImgSrc3();
	public abstract String getImgSrc4();
	public abstract double getPrice();
	public abstract String getShortDesc();
	public abstract String getDisplay();
	public abstract String getCameras();
	public abstract String getCpu();
	public abstract String getRam();
	public abstract String getSecMemory();
	
	//getters for variables inside accessory
	public abstract String getAccsProdName();
	public abstract String getAccsImgSrc1();
	
	
	
	
}
