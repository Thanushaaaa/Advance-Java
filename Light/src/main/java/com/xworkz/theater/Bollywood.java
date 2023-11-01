package com.xworkz.theater;

import org.springframework.stereotype.Component;

@Component
public class Bollywood implements Movie {

	@Override
	public void produce() {
		System.out.println("Produce method in Bollywood");

	}

	@Override
	public void promote() {
		System.out.println("Promote method in Bollywood");

	}

	@Override
	public void release() {
		System.out.println("Release method in Bollywood");

	}

}
