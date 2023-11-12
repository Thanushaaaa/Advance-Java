package com.xworkz.flag.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrackerDTO implements Serializable {

	private String name;
	private String brand;
	private int price;
	private double weight;

}
