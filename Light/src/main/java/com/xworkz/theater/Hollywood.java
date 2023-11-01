package com.xworkz.theater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.theater.lang.Language;

@Component
public class Hollywood implements Movie {

	@Autowired
	@Qualifier("english")
	private Language lang;

	public void produce() {
		System.out.println("Produce method in Hollywood");
		lang.speak();

	}

	public void promote() {
		System.out.println("Promote method in Hollywood");

	}

	public void release() {
		System.out.println("Release method in Hollywood");

	}

}
