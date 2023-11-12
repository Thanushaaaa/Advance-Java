package com.xworkz.sweets.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Controller

public class SweetsController {

	public SweetsController() {
		System.out.println("Created controller");
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		return "Shop";
	}

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public String getData(Model model) {
		model.addAttribute("Message", "Hello");
		return "Shop";
	}
	
	@RequestMapping(value="/sendSweets",method=RequestMethod.POST)
	public String sendSweets(@RequestParam String sweetName,@RequestParam int price,Model model)
	{
		System.out.println("Running send sweets method");
		System.out.println(sweetName);
		System.out.println(price);
		if(sweetName!=null&&!sweetName.isEmpty()&&price>50)
		{
			model.addAttribute("valid", "Valid details");
			return "Welcome";
		}
		model.addAttribute("valid", "Invalid details");
		return "Welcome";
	}
}
