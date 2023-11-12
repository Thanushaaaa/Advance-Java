package com.xworkz.festival.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.repo.FestivalRepository;

@Component
public class FestivalServiceImpl implements FestivalService {

	@Autowired
	private FestivalRepository festivalRepository;

	@Override
	public boolean validateAndSave(FestivalDTO festivalDTO) {

		if (festivalDTO.getFestivalName() != null && !festivalDTO.getFestivalName().isEmpty()) {
			if (festivalDTO.getNoOfDays() > 0) {
				if (festivalDTO.getSeason() != null && !festivalDTO.getSeason().isEmpty()) {
					festivalRepository.save(festivalDTO);
					return true;
				}
			}
		}
		return false;
	}

}
