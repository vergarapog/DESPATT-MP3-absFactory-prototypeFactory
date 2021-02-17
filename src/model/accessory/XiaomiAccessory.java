package model.accessory;

public class XiaomiAccessory extends Accessory {
	
	public XiaomiAccessory() {
		this.setProdName();
		this.setImgSrc1();
	}

	@Override
	public void setProdName() {
		// TODO Auto-generated method stub
		this.prodName = "Xiaomi Free Buds";
	}

	@Override
	public void setImgSrc1() {
		// TODO Auto-generated method stub
		this.imgSrc1 = "images/accessories/xiaomi/xiaomiaccs.jpg";
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
