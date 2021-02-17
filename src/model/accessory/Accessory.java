package model.accessory;

public abstract class Accessory {
	
	protected String prodName;
	protected String imgSrc1;
	
	public abstract void setProdName();
	public abstract void setImgSrc1();
	
	public abstract String getAccsProdName();
	public abstract String getAccsImgSrc1();

}
