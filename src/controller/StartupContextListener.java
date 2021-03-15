package controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;

import utility.prototype.db.*;

/**
 * This servlet ensures database is populated right from the start of opening webapp/deploying war file
 *
 */
@WebListener
public class StartupContextListener implements ServletContextListener {

	DbInitializeHelper db = new DbInitializeHelper();//db helper for creating and populating tables
	
	
    public void contextInitialized(ServletContextEvent arg0)  { 
    	   	
    	
    	db.createTables();
    	
    	db.populateProducts();
    	db.populateAccessories();
    	
    	
    	
    	
    	
    }


    public void contextDestroyed(ServletContextEvent arg0)  { 
    	
    	//db is dropped when server is stopped/warfile is undeployed
    	
    	db.dropDB(); //cleans up db after use, might change in MP4
    	
    }

	
	
}
