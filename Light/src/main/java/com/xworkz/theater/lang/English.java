package com.xworkz.theater.lang;

import org.springframework.stereotype.Component;

@Component("english")
public class English implements Language {

	@Override
	public void speak() {
		System.out.println("Speak method in English");

	}
}
