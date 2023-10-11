package com.xworkz.mobile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/game", loadOnStartup = 1)
public class PlayerServlet extends HttpServlet {

	public PlayerServlet() {
		System.out.println("No-arg const in PlayerServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method in PlayerServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service method in PlayerServlet");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method in PlayerServlet");
		String name = req.getParameter("name");
		String sport = req.getParameter("sport");
		String wifeName = req.getParameter("wifeName");
		String dateOfBirth = req.getParameter("dateOfBirth");
		String father = req.getParameter("father");
		String jerseyNo = req.getParameter("jerseyNo");
		String captainName = req.getParameter("captainName");
		String coachName = req.getParameter("coachName");
		String age = req.getParameter("age");
		

		System.out.println(("Name: ").concat(name).concat(" ").concat("Sport: ").concat(sport).concat(" ")
				.concat("Wife Name: ").concat(wifeName).concat(" ").concat("Date Of Birth: ").concat(dateOfBirth)
				.concat(" ").concat("Father: ").concat(father).concat(" ").concat("Jersey No: ").concat(jerseyNo)
				.concat(" ").concat("Captain name: ").concat(captainName).concat(" ").concat("Coach name: ")
				.concat(coachName).concat(" ").concat("Age: ").concat(age));
		req.setAttribute("key1", name);
		req.setAttribute("key2", sport);
		req.setAttribute("key3", wifeName);
		req.setAttribute("key4", dateOfBirth);
		req.setAttribute("key5", father);
		req.setAttribute("key6", jerseyNo);
		req.setAttribute("key7", captainName);
		req.setAttribute("key8", coachName);
		req.setAttribute("key9", age);
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("PlayerSuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Invoking destroy method in PlayerServlet");
		super.destroy();
	}

}
