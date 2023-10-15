package com.xworkz.bowler;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collector;

public class BrandRunner {

	public static void main(String[] args) {

		BrandDTO brandDTO1 = new BrandDTO("H&M", "Erling", 10, "Sweden");
		BrandDTO brandDTO2 = new BrandDTO("Microsoft", "Bill Gates", 31, "USA");
		BrandDTO brandDTO3 = new BrandDTO("Lego", "Ole", 13, "India");
		BrandDTO brandDTO4 = new BrandDTO("Dove", "Vincent", 10, "USA");
		BrandDTO brandDTO5 = new BrandDTO("Palmolive", "Johnson", 23, "England");
		BrandDTO brandDTO6 = new BrandDTO("Nivea", "Oscar", 21, "Iran");
		BrandDTO brandDTO7 = new BrandDTO("Intel", "Noyce", 11, "USA");
		BrandDTO brandDTO8 = new BrandDTO("Amazon", "Jeff Bezos", 10, "India");
		BrandDTO brandDTO9 = new BrandDTO("TATA", "Ratan Tata", 28, "France");
		BrandDTO brandDTO10 = new BrandDTO("Starbucks", "Jerry", 18, "USA");

		Collection<BrandDTO> brand = new HashSet<BrandDTO>();

		brand.add(brandDTO1);
		brand.add(brandDTO2);
		brand.add(brandDTO3);
		brand.add(brandDTO4);
		brand.add(brandDTO5);
		brand.add(brandDTO6);
		brand.add(brandDTO7);
		brand.add(brandDTO8);
		brand.add(brandDTO9);
		brand.add(brandDTO10);

		brand.stream().sorted().forEach((e) -> System.out.println(e));

		System.out.println("---Revenue greater than 20---");
		brand.stream().sorted().filter((e) -> e.getRevenueInBillion() > 20).forEach((e) -> System.out.println(e));

		System.out.println("---Revenue lesser than 20---");
		brand.stream().sorted().filter((e) -> e.getRevenueInBillion() < 20).forEach((e) -> System.out.println(e));

		Collection<BrandDTO> country = new HashSet<BrandDTO>();

		System.out.println("---Country USA---");
		brand.stream().sorted().forEach((e) -> {
			if (e.getCountry().equals("USA")) {
				country.add(e);
			}
		});

		country.stream().sorted().forEach((e) -> System.out.println(e));

		Collection<BrandDTO> country1 = new HashSet<BrandDTO>();

		System.out.println("---Country other than USA---");
		brand.stream().sorted().forEach((e) -> {
			if (!e.getCountry().equals("USA")) {
				country1.add(e);
			}
		});

		country1.stream().sorted().forEach((e) -> System.out.println(e));

		Collection<BrandDTO> country2 = new HashSet<BrandDTO>();

		System.out.println("---Brand name starting with I---");
		brand.stream().sorted().forEach((e) -> {
			if (e.getName().startsWith("I")) {
				country2.add(e);
			}
		});

		country2.stream().sorted().forEach((e) -> System.out.println(e));

		Collection<BrandDTO> country3 = new HashSet<BrandDTO>();

		System.out.println("---Owner name length greater than 5---");
		brand.stream().sorted().forEach((e) -> {
			if (e.getOwner().length()>5) {
				country3.add(e);
			}
		});

		country3.stream().sorted().forEach((e) -> System.out.println(e));
		
		System.out.println("---Owner name length lesser than 5---");
		
		brand.stream().sorted().filter((e) -> e.getOwner().length()<5).forEach((e) -> System.out.println(e));

	}

}
