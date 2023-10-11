package com.xworkz.temple.repository;

import com.xworkz.temple.dto.WasteDTO;

public class WasteRepositoryImpl implements WasteRepository {
	private WasteDTO[] wasteDTO1 = new WasteDTO[NO_OF_STREETS];
	private int start = 0;

	@Override
	public void save(WasteDTO wasteDTO) {
		if (start < wasteDTO1.length) {
			System.out.println("Invoking save method in waste repository implementation");
			wasteDTO1[start] = wasteDTO;
			System.out.println("Data is stored at index " + start);
			System.out.println("Data stored is " + wasteDTO1[start]);
			this.start++;
		} else {
			System.err.println("Array is full,can't store");
		}

	}

}
