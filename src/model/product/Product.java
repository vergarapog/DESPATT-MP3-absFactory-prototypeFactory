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
	protected int stockQty;
	
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
	public abstract int getStockQty();
	public abstract String getShortDesc();
	public abstract String getDisplay();
	public abstract String getCameras();
	public abstract String getCpu();
	public abstract String getRam();
	public abstract String getSecMemory();
	
	//getters for variables inside accessory
	public abstract String getAccsProdName();
	public abstract String getAccsImgSrc1();
	
	
	//for HashSet of ShoppingCart, Hashset because only one device per brand per customer
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cameras == null) ? 0 : cameras.hashCode());
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((display == null) ? 0 : display.hashCode());
		result = prime * result + ((imgSrc1 == null) ? 0 : imgSrc1.hashCode());
		result = prime * result + ((imgSrc2 == null) ? 0 : imgSrc2.hashCode());
		result = prime * result + ((imgSrc3 == null) ? 0 : imgSrc3.hashCode());
		result = prime * result + ((imgSrc4 == null) ? 0 : imgSrc4.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((prodName == null) ? 0 : prodName.hashCode());
		result = prime * result + ((ram == null) ? 0 : ram.hashCode());
		result = prime * result + ((secMemory == null) ? 0 : secMemory.hashCode());
		result = prime * result + ((shortDesc == null) ? 0 : shortDesc.hashCode());
		result = prime * result + stockQty;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cameras == null) {
			if (other.cameras != null)
				return false;
		} else if (!cameras.equals(other.cameras))
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (display == null) {
			if (other.display != null)
				return false;
		} else if (!display.equals(other.display))
			return false;
		if (imgSrc1 == null) {
			if (other.imgSrc1 != null)
				return false;
		} else if (!imgSrc1.equals(other.imgSrc1))
			return false;
		if (imgSrc2 == null) {
			if (other.imgSrc2 != null)
				return false;
		} else if (!imgSrc2.equals(other.imgSrc2))
			return false;
		if (imgSrc3 == null) {
			if (other.imgSrc3 != null)
				return false;
		} else if (!imgSrc3.equals(other.imgSrc3))
			return false;
		if (imgSrc4 == null) {
			if (other.imgSrc4 != null)
				return false;
		} else if (!imgSrc4.equals(other.imgSrc4))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		if (ram == null) {
			if (other.ram != null)
				return false;
		} else if (!ram.equals(other.ram))
			return false;
		if (secMemory == null) {
			if (other.secMemory != null)
				return false;
		} else if (!secMemory.equals(other.secMemory))
			return false;
		if (shortDesc == null) {
			if (other.shortDesc != null)
				return false;
		} else if (!shortDesc.equals(other.shortDesc))
			return false;
		if (stockQty != other.stockQty)
			return false;
		return true;
	}
	
	
	
	
}
