package com.xworkz.temple.repository;

import com.xworkz.temple.dto.WasteDTO;

public interface WasteRepository {

	int NO_OF_STREETS = 3;

	void save(WasteDTO wasteDTO);

}
