package com.xworkz.festival.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.festival.dto.FestivalDTO;

@Component
public class FestivalRepositoryImpl implements FestivalRepository {

	List<FestivalDTO> fests = new ArrayList<FestivalDTO>();

	@Override
	public boolean save(FestivalDTO festivalDTO) {

		boolean collect = fests.add(festivalDTO);

		if (collect) {
			System.out.println("Data is saved");
			return true;
		} else {
			System.out.println("Data is not saved");
			return false;
		}

	}

}
