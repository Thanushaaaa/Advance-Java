package com.xworkz.medicine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/data")
public class Table extends HttpServlet {
	public Table() {
		System.out.println("Creating servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in servlet");
		String name = req.getParameter("name");
		String message = req.getParameter("message");
		System.out.println(name);
		System.out.println(message);

	}
}
