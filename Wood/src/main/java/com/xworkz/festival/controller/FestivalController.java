package com.xworkz.festival.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.service.FestivalService;

@Controller
public class FestivalController {

	@Autowired
	private FestivalService service;

	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public String send(FestivalDTO festivalDTO, Model model) {

		boolean check = service.validateAndSave(festivalDTO);
		if (check) {
			model.addAttribute("saved", "Data is saved");
			return "FestivalSuccess";
		} else {
			model.addAttribute("saved", "Data is not saved");
			return "Sweet";
		}

	}

}
