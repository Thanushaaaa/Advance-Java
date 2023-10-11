package com.xworkz.market.service;

import java.util.Collection;

import com.xworkz.market.dto.GroceryDTO;
import com.xworkz.market.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {
	private GroceryRepository groceryRepository;

	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		this.groceryRepository = groceryRepository;
	}

	@Override
	public boolean validateAndSave(GroceryDTO groceryDTO) {
		System.out.println("Invoking validate and save method in grocery repository implementation");
		groceryRepository.save(groceryDTO);
		return true;
	}

	@Override
	public int total() {
		return this.groceryRepository.total();
	}
	@Override
	public Collection<GroceryDTO> getAll() {
		
		return groceryRepository.getAll();
	}

}
