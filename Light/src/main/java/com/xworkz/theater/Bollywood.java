package com.xworkz.theater;

import org.springframework.stereotype.Component;

@Component
public class Bollywood implements Movie {

	public void produce() {
		System.out.println("Produce method in Bollywood");

	}

	public void promote() {
		System.out.println("Promote method in Bollywood");

	}

	public void release() {
		System.out.println("Release method in Bollywood");

	}

}
