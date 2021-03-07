package model.accessory;

public abstract class Accessory {
	
	protected String prodName;
	protected String imgSrc1;
	

	
	//one setter for database transaction
		public abstract void setDetails();
	
	public abstract String getAccsProdName();
	public abstract String getAccsImgSrc1();

}
