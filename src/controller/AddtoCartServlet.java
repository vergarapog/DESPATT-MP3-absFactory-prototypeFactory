package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.shoppingcartandpayments.*;


@WebServlet("/AddtoCartServlet")
public class AddtoCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		// Get the cart.
        Cart cart = (Cart) session.
            getAttribute("Cart");

        // If there is no shopping cart, create one.
        if (cart == null)
        {
            cart = new Cart();

            session.setAttribute("Cart", cart);
        }
		
		String requested = request.getParameter("brand");
		
		
		cart.addItem(requested);
		cart.checkSize();
		
		response.sendRedirect("cart.jsp");
		
		
	}

}
