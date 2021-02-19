package utility.prototype.db;

import java.util.HashMap;
import java.util.Map;

public class ConnectionPrototypeFactory {

	private static final Map<String, CloneableConnection> prototypes = new HashMap<>();

	//eager loading/instantiation
    static {
    	System.out.println("inside Factory static");
        prototypes.put("myConnection", new MyConnection());
         
    }

    public static CloneableConnection getPrototype(String type) {
    	System.out.println("inside getPrototype()");
    	try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
	
	
	
}
