package com.xworkz.earth;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PassportDTO {

	private int id;
	private String number;
	private LocalDate issuedDate;
	private String issuedBy;
	private LocalDate expiryDate;
	private PassportType passportType;

}
