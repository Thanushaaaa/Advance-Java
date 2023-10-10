package com.xworkz.cadbury.tester;

public class ThermometerRunner {

	public static void main(String[] args) {

		Newspaper newspaper = (a) -> {
			if (a.equals("TOI")) {
				return 8;
			} else if (a.equals("DC")) {
				return 5;
			} else if (a.equals("HT")) {
				return 4;
			}
			return 0;
		};
		read(newspaper, "TOI");
		read(newspaper, "DC");
		read(newspaper, "TO");

		Iphone iphone = () -> {
			return true;
		};
		buy(iphone);
		Tyre tyre = (c, d, e) -> {
			if (c.equals("MRF") && d == 15 && e.equals("TWO")) {
				return 1300;
			}
			if (c.equals("MRF") && d == 17 && e.equals("TWO")) {
				return 1500;
			}
			if (c.equals("TVS") && d == 12 && e.equals("TWO")) {
				return 900;
			}
			return 0;
		};
		shop(tyre, "MRF", 15, "TWO");
		shop(tyre, "MRF", 17, "TWO");
		shop(tyre, "TVS", 12, "TWO");

	}

	static void read(Newspaper newspaper, String agency) {
		System.out.println("Read method");
		double price = newspaper.priceByAgency(agency);
		System.out.println("Price is " + price);
	}

	static void buy(Iphone iphone) {
		System.out.println("buy method");
		boolean color = iphone.looksGood();
		System.out.println("Does it look good " + color);
	}

	static void shop(Tyre tyre, String brand, int size, String type) {
		System.out.println("shop method");
		double price = tyre.getPrice(brand, size, type);
		System.out.println("Price " + price);
	}
}
