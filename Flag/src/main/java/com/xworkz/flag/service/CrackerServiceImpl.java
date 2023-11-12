package com.xworkz.flag.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import com.xworkz.flag.dto.CrackerDTO;

@Component
public class CrackerServiceImpl implements CrackerService {

	@Override
	public boolean validate(CrackerDTO dto, Model model) {

		if (dto != null) {

			if (dto.getName() == null || dto.getName().isEmpty()) {
				model.addAttribute("nameValid", "Invalid name entered");

			}

			if (dto.getBrand() == null || dto.getBrand().isEmpty()) {

				model.addAttribute("brandValid", "Invalid brand entered");

			}

			if (dto.getPrice() <= 0) {

				model.addAttribute("priceValid", "Invalid price entered");

			}

			if (dto.getWeight() <= 0) {

				model.addAttribute("weightValid", "Invalid weight entered");

			}

			if (model.containsAttribute("nameValid") || model.containsAttribute("brandValid")
					|| model.containsAttribute("priceValid") || model.containsAttribute("weightValid")) {
				return false;
			}

		}
		model.addAttribute("data", dto);
		return true;

	}
}
