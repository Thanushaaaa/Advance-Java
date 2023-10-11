package com.xworkz.market.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.market.dto.GroceryDTO;
import com.xworkz.market.repository.GroceryRepository;
import com.xworkz.market.repository.GroceryRepositoryImpl;
import com.xworkz.market.service.GroceryService;
import com.xworkz.market.service.GroceryServiceImpl;

@WebServlet(urlPatterns = {"/shop","/total","/view"}, loadOnStartup = 1)
public class GroceryController extends HttpServlet {

	GroceryRepository groceryRepository = new GroceryRepositoryImpl();
	GroceryService groceryService = new GroceryServiceImpl(groceryRepository);

	public GroceryController() {
		System.out.println("Creating instance of servlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method in GroceryServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service method in GroceryServlet");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method in GroceryServlet");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String quantity = req.getParameter("quantity");
		System.out.println("Name: ".concat(name).concat(" ").concat("Type: ").concat(type));
		req.setAttribute("name", name);
		req.setAttribute("type", type);
		double convertedPrice = Double.parseDouble(price);
		double convertedQuantity = Double.parseDouble(quantity);
		req.setAttribute("price", convertedPrice);
		req.setAttribute("quantity", convertedQuantity);
		System.out.println("Price: " + convertedPrice);
		System.out.println("Quantity: " + convertedQuantity);

		GroceryDTO groceryDTO = new GroceryDTO(name, type, convertedPrice, convertedQuantity);

		boolean stored = groceryService.validateAndSave(groceryDTO);
		System.out.println("Saved :" + stored);
		req.setAttribute("total", this.groceryService.total());
		RequestDispatcher dispatcher = req.getRequestDispatcher("Grocery.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri=req.getRequestURI();
		if(uri.endsWith("/total"))
		{
			System.out.println("URI is :" +uri);
		req.setAttribute("total", this.groceryService.total());
		req.getRequestDispatcher("Grocery.jsp").forward(req, resp);
		}
		if(uri.endsWith("/view"))
		{
			System.out.println("URI is :" +uri);
		req.setAttribute("view", this.groceryService.getAll());
		req.getRequestDispatcher("GroceryView.jsp").forward(req, resp);
		}
	}
    
	@Override
	public void destroy() {
		System.out.println("Invoking destroy method in GroceryServlet");
		super.destroy();
	}

}
