package com.xworkz.resort.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/eat", loadOnStartup = 1)
public class FoodServlet extends HttpServlet {

	public FoodServlet() {
		System.out.println("No-arg const in FoodServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method in FoodServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service method in FoodServlet");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method in FoodServlet");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String hotel = req.getParameter("hotel");
		String price = req.getParameter("price");
		String quantity = req.getParameter("quantity");
        System.out.println("Name: ".concat(name).concat(" ").concat("Type: ").concat(type).concat(" ").concat("Hotel name: ")
        		.concat(hotel).concat(" ").concat("Price: ").concat(price).concat(" ").concat("Quantity: ").concat(quantity));
        
		req.setAttribute("name", name);
		req.setAttribute("type", type);
		req.setAttribute("hotel", hotel);
		
		int quantity1 = Integer.parseInt(quantity);
		if (quantity1 > 1) {
			req.setAttribute("quantity", quantity1);
		}
		int price1 = Integer.parseInt(price);
		if (price1 > 300) {
			req.setAttribute("price", price1);
		}
		
		Integer total=price1*quantity1;
		req.setAttribute("total", total);
		
		System.out.println("Total price: "+total);
		RequestDispatcher dispatcher = req.getRequestDispatcher("FoodSuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Invoking destroy method in FoodServlet");
		super.destroy();
	}

}
