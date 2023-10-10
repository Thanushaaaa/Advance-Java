package com.xworkz.temple.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.temple.repository.TempleRepositoryImpl;
import com.xworkz.temple.service.TempleServiceImpl;
import com.xworkz.temple.service.TempleService;
import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;

@WebServlet(urlPatterns = { "/pray", "/total", "/view" }, loadOnStartup = 1)
public class TempleController extends HttpServlet {
	TempleRepository templeRepository = new TempleRepositoryImpl();
	TempleService templeService = new TempleServiceImpl(templeRepository);

	public TempleController() {
		System.out.println("Creating instance of temple servlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method in temple servlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service method in temple servlet");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking post method in temple servlet");
		String name = req.getParameter("name");
		String place = req.getParameter("place");
		String mainGod = req.getParameter("mainGod");
		String constYear = req.getParameter("constYear");
		String constBy = req.getParameter("constBy");
		System.out.println("Name: ".concat(name).concat(" ").concat("Place: ").concat(place).concat(" ")
				.concat("Constructed by: ").concat(constBy).concat(" ").concat("Main god: ").concat(mainGod));
		int convertedYear = Integer.parseInt(constYear);
		System.out.println("Constructed year: " + convertedYear);
		TempleDTO templeDTO = new TempleDTO(name, place, mainGod, constBy, convertedYear);

		boolean stored = templeService.validateAndSave(templeDTO);
		System.out.println("Saved :" + stored);
		req.setAttribute("total", this.templeService.total());
		RequestDispatcher dispatcher = req.getRequestDispatcher("Temple.jsp");
		dispatcher.forward(req, resp);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		System.out.println("URI is :" + uri);
		if (uri.endsWith("/total")) {

			req.setAttribute("total", this.templeService.total());
			req.getRequestDispatcher("Temple.jsp").forward(req, resp);
		}
		if (uri.endsWith("/view")) {

			req.setAttribute("view", this.templeService.getAll());
			req.getRequestDispatcher("TempleView.jsp").forward(req, resp);
		}
	}

}
