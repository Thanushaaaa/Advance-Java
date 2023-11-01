package com.xworkz.festival.app;

public class Eid implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celebrate method in Eid");
		
	}

	@Override
	public void pray() {
		System.out.println("Pray method in Eid");
		
	}

}
