package com.xworkz.director.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieDTO implements Serializable{
	
	private int id;
	private String name;
	private String producer;
	private String director;
	private long budget; 
	private MovieLanguage movieLanguage;

}
