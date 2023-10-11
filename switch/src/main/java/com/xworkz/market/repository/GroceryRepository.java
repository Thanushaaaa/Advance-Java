package com.xworkz.market.repository;

import java.util.Collection;

import com.xworkz.market.dto.GroceryDTO;

public interface GroceryRepository {
	void save(GroceryDTO groceryDTO);
	
	default int total()
	{
		return 0;
	}
	default Collection<GroceryDTO> getAll()
	{
		return null;
	}

}
