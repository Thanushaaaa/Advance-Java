package com.xworkz.Plane;

public class PlaneRunner {

	public static void main(String[] args) {

		Plane plane = new Plane();
		plane.run();

		Plane plane1 = new Plane();
		plane1.start();

		Thread t1 = new Thread(new Helicopter());
		t1.start();

		Thread t2 = new Thread(new Helicopter());
		t2.start();

	}

}
