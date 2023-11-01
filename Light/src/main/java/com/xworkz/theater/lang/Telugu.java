package com.xworkz.theater.lang;

import org.springframework.stereotype.Component;

@Component("telugu")
public class Telugu implements Language {

	@Override
	public void speak() {
		System.out.println("Speak method in Telugu");

	}
}
