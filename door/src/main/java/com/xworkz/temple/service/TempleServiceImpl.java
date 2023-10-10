package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;

public class TempleServiceImpl implements TempleService {

	private TempleRepository templeRepository;

	public TempleServiceImpl(TempleRepository templeRepository) {
		this.templeRepository = templeRepository;
	}

	@Override
	public boolean validateAndSave(TempleDTO templeDTO) {
		System.out.println("Invoking validate and save in temple service implementation");
		templeRepository.save(templeDTO);
		return true;
	}

	@Override
	public int total() {

		return this.templeRepository.total();
	}

	@Override
	public Collection<TempleDTO> getAll() {

		return this.templeRepository.getAll();
	}

}
