package com.xworkz.mobile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dinner", loadOnStartup = 1)
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println("No-arg const in ProductServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method in ProductServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service method in ProductServlet");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method in ProductServlet");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String type = req.getParameter("type");
		String quantity = req.getParameter("quantity");

		System.out.println(("name: ").concat(name).concat(" ").concat("price: ").concat(price).concat(" ")
				.concat("type: ").concat(type).concat(" ").concat("quantity: ").concat(quantity));
		req.setAttribute("key1", name);
		req.setAttribute("key2", price);
		req.setAttribute("key3", type);
		req.setAttribute("key4", quantity);
		RequestDispatcher dispatcher = req.getRequestDispatcher("ProductSuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Invoking destroy method in ProductServlet");
		super.destroy();
	}

}
