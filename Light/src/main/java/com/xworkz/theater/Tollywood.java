package com.xworkz.theater;

import org.springframework.stereotype.Component;

@Component
public class Tollywood implements Movie {

	@Override
	public void produce() {
		System.out.println("Produce method in Tollywood");

	}
    
	@Override
	public void promote() {
		System.out.println("Promote method in Tollywood");

	}

	@Override
	public void release() {
		System.out.println("Release method in Tollywood");

	}

}
