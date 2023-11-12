package com.xworkz.perfume.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.repository.PerfumeRepository;

@Component
public class PerfumeServiceImpl implements PerfumeService {

	@Autowired
	PerfumeRepository perfumeRepository;

	@Override
	public boolean validateAndSave(PerfumeDTO perfumeDTO) {
		
		if (perfumeDTO.getName() != null && perfumeDTO.getName().length() > 3) {
			if (perfumeDTO.getPrice() != 0 && perfumeDTO.getPrice() > 500) {
				if (perfumeDTO.getQuantity() != 0 && perfumeDTO.getQuantity() > 1) {
					if (perfumeDTO.getCountry() != null && perfumeDTO.getCountry().length() > 3) {
						perfumeRepository.save(perfumeDTO);
						System.out.println("Data saved");
						return true;
					}
				}
			}
		}
		System.out.println("Data not saved");
		return false;
	}

	@Override
	public Collection<PerfumeDTO> findByName(String name) {
		
		if (name != null && name.length() > 3) {

			return perfumeRepository.findByName(name);

		}
		return null;

	}

	@Override
	public Collection<PerfumeDTO> readAll() {

		return perfumeRepository.readAll();
	}

	@Override
	public boolean isExist(PerfumeDTO perfumeDTO) {

		return perfumeRepository.isExist(perfumeDTO);

	}

	@Override
	public Collection<PerfumeDTO> updateByUsingName(String name, int price) {
		
		if (name != null && name.length() > 3 && price > 500) {
		return perfumeRepository.updateByUsingName(name, price);
			
		}
		return null;
	}

	@Override
	public Collection<PerfumeDTO> deleteByUsingName(String name) {
		
		if (name != null && name.length() > 3) {
			return perfumeRepository.deleteByUsingName(name);
				
			}
		return null;
	}

}
