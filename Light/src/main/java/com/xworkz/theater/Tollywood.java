package com.xworkz.theater;

import org.springframework.stereotype.Component;

@Component
public class Tollywood implements Movie {

	public void produce() {
		System.out.println("Produce method in Tollywood");

	}

	public void promote() {
		System.out.println("Promote method in Tollywood");

	}

	public void release() {
		System.out.println("Release method in Tollywood");

	}

}
