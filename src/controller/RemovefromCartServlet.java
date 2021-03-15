package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.shoppingcartandpayments.Cart;

/**
 * Servlet implementation class RemovefromCartServlet
 */

public class RemovefromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		
		String remove = request.getParameter("brand");
		
		// Get the cart.
        Cart cart = (Cart) session.
            getAttribute("Cart");

        // If there is no shopping cart, create one.
        if (cart == null)
        {
            cart = new Cart();

            session.setAttribute("Cart", cart);
        }
        
        cart.removeItem(remove);
        
        response.sendRedirect("cart.jsp");
        
		
		
	}

}
