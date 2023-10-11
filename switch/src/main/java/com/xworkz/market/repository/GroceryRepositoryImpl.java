package com.xworkz.market.repository;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.market.dto.GroceryDTO;

public class GroceryRepositoryImpl implements GroceryRepository {

	private Collection<GroceryDTO> group = new LinkedList<GroceryDTO>();

	@Override
	public void save(GroceryDTO groceryDTO) {
		System.out.println("Invoking save method in grocery repository implementation");
		boolean saved = this.group.add(groceryDTO);
		if (saved) {
			System.out.println("Data saved");

		} else {
			System.out.println("Data is not saved");
		}

	}
	@Override
	public int total() {
		System.out.println("Total method in grocery repository");
		return this.group.size();
	}
	@Override
	public Collection<GroceryDTO> getAll() {
		
		return this.group;
	}

}
