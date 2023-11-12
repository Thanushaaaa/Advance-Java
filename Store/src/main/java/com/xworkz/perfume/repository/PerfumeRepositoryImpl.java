package com.xworkz.perfume.repository;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.perfume.dto.PerfumeDTO;

@Component
public class PerfumeRepositoryImpl implements PerfumeRepository {

	@Autowired
	Collection<PerfumeDTO> perfume;

	@Override
	public boolean save(PerfumeDTO perfumeDTO) {

		perfume.add(perfumeDTO);
		return true;
	}

	@Override
	public Collection<PerfumeDTO> findByName(String name) {

		if (name != null) {
			List<PerfumeDTO> perfume1 = perfume.stream().sorted().filter(e -> e.getName().equalsIgnoreCase(name))
					.collect(Collectors.toList());
			perfume1.forEach(e -> System.out.println(e));
		}
		return null;
	}

	@Override
	public Collection<PerfumeDTO> readAll() {

		return perfume;

	}

	@Override
	public boolean isExist(PerfumeDTO perfumeDTO) {

		Collection<PerfumeDTO> dtos = readAll();

		for (PerfumeDTO dto : dtos) {

			if (dto.getName().equals(perfumeDTO.getName())) {
				System.out.println("Perfume already exists");
				return true;
			}
		}

		System.err.println("Perfume doesn't exist");
		return false;
	}

	@Override
	public Collection<PerfumeDTO> updateByUsingName(String name, int price) {

		Collection<PerfumeDTO> perfumes = readAll();

		for (PerfumeDTO p : perfumes) {
			if (p.getName().equals(name)) {
				p.setPrice(price);
				return perfumes;
			}
		}

		return null;
	}

	@Override
	public Collection<PerfumeDTO> deleteByUsingName(String name) {

		Collection<PerfumeDTO> perfumes = readAll();

		for (PerfumeDTO p : perfumes) {

			if (p.getName().equals(name)) {
				perfumes.remove(p);
				return perfumes;
			}
		}
		return null;
	}

}
