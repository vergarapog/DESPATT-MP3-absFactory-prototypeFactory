package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.accessory.Accessory;
import model.product.Product;
import utility.AccessoryFactory;
import utility.ProductFactory;
import model.searchResultHolder.*;

/**
 * Servlet implementation class SearchProductServlet
 */

public class SearchProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requested = request.getParameter("prodName");
		
		// helper class for handling the code required for finding searched product
		SearchResults results = new SearchResults();
		
		//calls method with the database calls
		results.getSearchedProducts(requested);
		
		if(results.isListEmpty() == true) {//redirects to not found page if no prodduct is found
			response.sendRedirect("prodna.jsp");
			return;
		}
		
		request.setAttribute("searchResults", results);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
		
		dispatcher.forward(request, response);
		
		
		
	}

}
