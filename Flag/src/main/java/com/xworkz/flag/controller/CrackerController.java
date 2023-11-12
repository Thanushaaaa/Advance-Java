package com.xworkz.flag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.flag.dto.CrackerDTO;
import com.xworkz.flag.service.CrackerService;

@Component
@Controller
public class CrackerController {

	@Autowired
	private CrackerService service;

	public CrackerController() {
		System.out.println("Created controller");
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		return "Shop";
	}

	@RequestMapping(value = "/dto", method = RequestMethod.POST)
	public String getDto(CrackerDTO dto, Model model) {

		System.out.println("method running");
		boolean valid = service.validate(dto, model);
		if (valid) {
			return "Success";
		}
		return "Shop";
	}

}
