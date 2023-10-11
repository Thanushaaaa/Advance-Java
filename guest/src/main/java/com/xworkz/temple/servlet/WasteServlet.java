package com.xworkz.temple.servlet;

import com.xworkz.temple.dto.WasteDTO;
import com.xworkz.temple.repository.*;
import com.xworkz.temple.service.WasteService;
import com.xworkz.temple.service.WasteServiceImpl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/holiday", loadOnStartup = 1)
public class WasteServlet extends HttpServlet {
	public WasteServlet() {
		System.out.println("Creating instance of survlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method in servlet");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String weight = req.getParameter("weight");
		int weight1 = Integer.valueOf(weight);
		System.out.println("Name: ".concat(name).concat(" ").concat("Type: ").concat(type));
		System.out.println(weight1);

		req.setAttribute("Name", name);
		req.setAttribute("Type", type);
		int convertedWeight = Integer.valueOf(weight);
		req.setAttribute("Weight", weight);
		// Servlet chaining or Request forwarding
		RequestDispatcher dispatcher = req.getRequestDispatcher("WasteSuccess.jsp");
		dispatcher.forward(req, resp);
		WasteDTO wasteDTO = new WasteDTO(name, type, convertedWeight);
		WasteRepository wasteRepository = new WasteRepositoryImpl();
		WasteService wasteService = new WasteServiceImpl(wasteRepository);
		boolean isSaved = wasteService.validateAndSave(wasteDTO);
		if (isSaved) {
			System.out.println("Data is saved");
			return;
		} else {
			System.err.println("Data isn't saved");
			return;
		}

	}

}
