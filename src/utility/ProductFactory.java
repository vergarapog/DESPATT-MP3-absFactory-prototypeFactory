package utility;

import model.accessory.Accessory;
import model.product.*;

public class ProductFactory implements AbstractFactory {
	
	@Override
	public Product getProduct (String productType) {
		//type of object that will be returned
		Product product = null;
		
	
		switch(productType) {
		
			case "APPLE":
				product = new Apple();
				break;
			case "SAMSUNG":
				product = new Samsung();
				break;
			case "XIAOMI":
				product = new Xiaomi();
				break;

		}
		return product;
	}
	
	@Override
	public Accessory getAccessory(String name) {  
		// TODO Auto-generated method stub
		return null;
	}

}
