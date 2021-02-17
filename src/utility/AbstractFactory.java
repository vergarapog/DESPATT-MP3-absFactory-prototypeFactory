package utility;

import model.product.*;
import model.accessory.*;

public interface AbstractFactory {
	
	Product getProduct(String input);
	Accessory getAccessory(String name);

}
