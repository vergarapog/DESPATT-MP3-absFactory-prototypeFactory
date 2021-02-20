package controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import utility.prototype.db.*;
import utility.DbInitializeHelper;

/**
 * Application Lifecycle Listener implementation class StartupContextListener
 *
 */
@WebListener
public class StartupContextListener implements ServletContextListener {

	
    public void contextInitialized(ServletContextEvent arg0)  { 
    	
    	CloneableConnection myCon = ConnectionPrototypeFactory.getPrototype("myConnection");
    	
    	DbInitializeHelper db = new DbInitializeHelper(myCon);
    	
    	db.createTables();
    	
    	
    }


    public void contextDestroyed(ServletContextEvent arg0)  { 
    }

	
	
}
