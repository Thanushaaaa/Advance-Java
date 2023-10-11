package com.xworkz.lotion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/friday.rain")
public class Award extends HttpServlet {
	public Award() {
		System.out.println("Creating servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doGet in servlet");
		String name = req.getParameter("name");
		String language = req.getParameter("language");
		String director = req.getParameter("director");
		String producer = req.getParameter("producer");
		String budget = req.getParameter("budget");
		String releaseDate = req.getParameter("releaseDate");
		System.out.println(name);
		System.out.println(language);
		System.out.println(director);
		System.out.println(producer);
		System.out.println(budget);
		System.out.println(releaseDate);
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print("<meta charset=\"utf-8\">");
		printWriter.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		printWriter.print("<title>");
		printWriter.print("Response");
		printWriter.print("</title>");
		printWriter.print("<link\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n"
				+ "	rel=\"stylesheet\"\r\n"
				+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n"
				+ "	crossorigin=\"anonymous\">");
		printWriter.print("</head>");
		printWriter.print("<body>");
		printWriter.print("<nav class=\"navbar navbar-light bg-primary\">");
		printWriter.print("<ul class=\"nav nav-pills card-header-pills\">");
		printWriter.print("<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
				+ "					href=\"index.html\">Home</a></li>");
		printWriter.print("<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
				+ "					href=\"Movie.html\">Movie</a></li>");
		printWriter.print("</ul>");
		printWriter.print("</nav>");
		printWriter.print("<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>");
		printWriter.print("<h1>Saved successfully</h1>");
		printWriter.print("<br> Movie Name :" +name);
		printWriter.print("<br> Language :" +language);
		printWriter.print("<br> Director :" +director);
		printWriter.print("<br> Producer  :" +producer);
		printWriter.print("<br> Budget :" +budget);
		printWriter.print("<br> Release Date :" +releaseDate);
		printWriter.print("</body>");
		printWriter.print("</html>");
		
	}

}
