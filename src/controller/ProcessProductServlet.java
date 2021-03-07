package controller;

import utility.*;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.accessory.Accessory;
import model.product.*;


public class ProcessProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
			String requested = request.getParameter("prodName");
			
			
			
			//this servlet can now only be accessed by clicking the purchase button in search.jsp after searching 
			//of products from the database table in model SearchResult Class
			if(requested.equalsIgnoreCase("APPLE") || requested.equalsIgnoreCase("SAMSUNG") || requested.equalsIgnoreCase("XIAOMI")) {
				
				Product product = new ProductFactory().getProduct(requested.toUpperCase());
				
				//create accessory factory and get accessory object
				Accessory accessory = new AccessoryFactory().getAccessory(requested.toUpperCase());
				
				//bundle accessory to product
				product.setAccessory(accessory);
				
				
				request.setAttribute("prod", product);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("productDetails.jsp");
				dispatcher.forward(request, response);
			} else {
				
				response.sendRedirect("prodna.jsp");
				return;
			}
			
			
			
			
			
		
	}

}
