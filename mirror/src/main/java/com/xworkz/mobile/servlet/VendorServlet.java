package com.xworkz.mobile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/road", loadOnStartup = 1)
public class VendorServlet extends HttpServlet {

	public VendorServlet() {
		System.out.println("No-arg const in VendorServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method in VendorServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service method in VendorServlet");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method in VendorServlet");
		String name = req.getParameter("name");
		String gst = req.getParameter("gst");
		String owner = req.getParameter("owner");
		String location = req.getParameter("location");
		System.out.println(("Name: ").concat(name).concat(" ").concat("GST: ").concat(gst).concat(" ").concat("Owner: ")
				.concat(owner).concat(" ").concat("Location: ").concat(location));
		req.setAttribute("key1", name);
		req.setAttribute("key2", gst);
		req.setAttribute("key3", owner);
		req.setAttribute("key4", location);
		RequestDispatcher dispatcher1 = req.getRequestDispatcher("VendorSuccess.jsp");
		dispatcher1.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Invoking destroy method in VendorServlet");
		super.destroy();
	}
}
