package com.xworkz.temple.repository;

import java.util.Collection;
import java.util.HashSet;
import com.xworkz.temple.dto.TempleDTO;

public class TempleRepositoryImpl implements TempleRepository {
	private Collection<TempleDTO> group = new HashSet<TempleDTO>();

	@Override
	public void save(TempleDTO templeDTO) {
		System.out.println("Invoking save method in temple repository implementation");
		boolean saved = this.group.add(templeDTO);
		if (saved) {
			System.out.println("Data is saved " + saved);
		} else {
			System.out.println("Data is not saved ");
		}

	}

	@Override
	public int total() {
		System.out.println("Invoking total method in temple repository implementation");
		return this.group.size();
	}

	@Override
	public Collection<TempleDTO> getAll() {

		return this.group;
	}

}
