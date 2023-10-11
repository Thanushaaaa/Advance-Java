package com.xworkz.mobile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/fly", loadOnStartup = 1)
public class AirportServlet extends HttpServlet {

	public AirportServlet() {
		System.out.println("No-arg const in AirportServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method in AirportServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service method in AirportServlet");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method in AirportServlet");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String country = req.getParameter("country");
		String city = req.getParameter("city");
		String capacity = req.getParameter("capacity");
		String width = req.getParameter("width");
		String totalTerminals = req.getParameter("totalTerminals");
		String openDate = req.getParameter("openDate");
		String inauguratedBy = req.getParameter("inauguratedBy");
		System.out.println(("Name: ").concat(name).concat(" ").concat("Type: ").concat(type).concat(" ")
				.concat("Country : ").concat(country).concat(" ").concat("City: ").concat(city).concat(" ")
				.concat("Capacity: ").concat(capacity).concat(" ").concat("Width: ").concat(width).concat(" ")
				.concat("Total terminals: ").concat(totalTerminals).concat(" ").concat("Open date: ").concat(openDate)
				.concat(" ").concat("Inaugurated by: ").concat(inauguratedBy));
		req.setAttribute("key1", name);
		req.setAttribute("key2", type);
		req.setAttribute("key3", country);
		req.setAttribute("key4", city);
		req.setAttribute("key5", capacity);
		req.setAttribute("key6", width);
		req.setAttribute("key7", totalTerminals);
		req.setAttribute("key8", openDate);
		req.setAttribute("key9", inauguratedBy);

		RequestDispatcher dispatcher = req.getRequestDispatcher("AirportSuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Invoking destroy method in AirportServlet");
		super.destroy();
	}

}
