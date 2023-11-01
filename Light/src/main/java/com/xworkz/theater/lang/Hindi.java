package com.xworkz.theater.lang;

import org.springframework.stereotype.Component;

@Component("hindi")
public class Hindi implements Language {

	@Override
	public void speak() {
		System.out.println("Speak method in Hindi");

	}

}
