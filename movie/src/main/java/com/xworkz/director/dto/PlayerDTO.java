package com.xworkz.director.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlayerDTO implements Serializable{
	
	private int id;
	private String name;
	private String country;
	private int age;
	private PlayerSport playerSport;

}
