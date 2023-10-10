package com.xworkz.temple.repository;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;

public interface TempleRepository {

	void save(TempleDTO templeDTO);

	default int total() {
		return 0;
	}

	default Collection<TempleDTO> getAll() {
		return null;
	}

}
