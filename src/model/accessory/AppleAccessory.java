package model.accessory;

public class AppleAccessory extends Accessory {
	
	public AppleAccessory() {
		this.setProdName();
		this.setImgSrc1();
	}

	@Override
	public void setProdName() {
		// TODO Auto-generated method stub
		this.prodName = "Apple Airpods Pro";
	}

	@Override
	public void setImgSrc1() {
		// TODO Auto-generated method stub
		this.imgSrc1 = "images/accessories/apple/appleaccs.jpg";
	}

	@Override
	public String getAccsProdName() {
		// TODO Auto-generated method stub
		return prodName;
	}

	@Override
	public String getAccsImgSrc1() {
		// TODO Auto-generated method stub
		return imgSrc1;
	}

}
