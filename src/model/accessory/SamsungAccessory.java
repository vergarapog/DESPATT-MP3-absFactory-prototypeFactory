package model.accessory;

public class SamsungAccessory extends Accessory {
	
	public SamsungAccessory() {
		this.setProdName();
		this.setImgSrc1();
	}

	@Override
	public void setProdName() {
		// TODO Auto-generated method stub
		this.prodName = "Samsung Galaxy Buds";
	}

	@Override
	public void setImgSrc1() {
		// TODO Auto-generated method stub
		this.imgSrc1 = "images/accessories/samsung/samsungaccs2.jpg";
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
