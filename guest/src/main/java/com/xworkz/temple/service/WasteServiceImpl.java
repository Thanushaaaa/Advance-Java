package com.xworkz.temple.service;

import com.xworkz.temple.repository.*;
import com.xworkz.temple.util.ValidationUtil;
import com.xworkz.temple.dto.WasteDTO;

public class WasteServiceImpl implements WasteService {

	private WasteRepository wasteRepository;

	public WasteServiceImpl(WasteRepository wasteRepository) {
		this.wasteRepository = wasteRepository;
	}

	@Override
	public boolean validateAndSave(WasteDTO wasteDTO) {
		if (wasteDTO != null) {
			System.out.println("Invoking validate and save in waste service implementation");
			System.out.println("Data entered is " + wasteDTO);
			String name = wasteDTO.getStreetName();
			String type = wasteDTO.getType();

			int weight = wasteDTO.getWeight();
			if (ValidationUtil.validateString(name)) {
				System.out.println("Valid name entered");
			} else {
				System.err.println("Invalid name entered");
				return false;
			}
			if (ValidationUtil.validateString(type)) {
				System.out.println("Valid type entered");
			} else {
				System.err.println("Invalid type entered");
				return false;
			}

			if (ValidationUtil.validateInt(weight)) {
				System.out.println("Valid weight entered");
			} else {
				System.err.println("Invalid weight entered");
				return false;
			}
			System.out.println(" :) ");
			wasteRepository.save(wasteDTO);
			return true;
		}
		return false;

	}

}
