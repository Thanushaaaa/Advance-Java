package com.xworkz.festival.app;

public class Christmas implements Festival{
	@Override
	public void celebrate() {
		System.out.println("Celebrate method in Christmas");
		
	}

	@Override
	public void pray() {
		System.out.println("Pray method in Christmas");
		
	}

}
