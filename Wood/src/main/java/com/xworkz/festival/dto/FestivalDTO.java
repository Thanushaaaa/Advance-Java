package com.xworkz.festival.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FestivalDTO {

	private String festivalName;
	private int noOfDays;
	private String date;
	private String season;

}
