package utility;

import model.accessory.Accessory;
import model.product.Apple;
import model.product.Product;
import model.product.Samsung;
import model.product.Xiaomi;

import model.accessory.*;

public class AccessoryFactory implements AbstractFactory {

	@Override
	public Product getProduct(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Accessory getAccessory(String accsName) {  //do this
		//type of object that will be returned
				Accessory accessory = null;
				
			
				switch(accsName) {
				
					case "APPLE":
						accessory = new AppleAccessory();
						break;
					case "SAMSUNG":
						accessory = new SamsungAccessory();
						break;
					case "XIAOMI":
						accessory = new XiaomiAccessory();
						break;

				}
				return accessory;
	}

}
