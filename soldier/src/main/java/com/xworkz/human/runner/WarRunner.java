package com.xworkz.human.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import com.xworkz.human.dto.CountryDTO;
import com.xworkz.human.dto.PresidentDTO;
import com.xworkz.human.dto.WarDTO;

public class WarRunner {

	public static void main(String[] args) {

		PresidentDTO presidentDTO = new PresidentDTO(1, "Franklin D. Roosevelt", LocalDate.of(1933, 03, 04),
				LocalDate.of(1945, 04, 12));
		PresidentDTO presidentDTO1 = new PresidentDTO(2, "Abraham Lincoln", LocalDate.of(1861, 3, 4),
				LocalDate.of(1865, 4, 15));
		PresidentDTO presidentDTO2 = new PresidentDTO(3, "George Washington", LocalDate.of(1789, 04, 30),
				LocalDate.of(1797, 03, 04));
		PresidentDTO presidentDTO3 = new PresidentDTO(4, "Thomas Jefferson", LocalDate.of(1801, 03, 04),
				LocalDate.of(1809, 03, 04));
		PresidentDTO presidentDTO4 = new PresidentDTO(5, "Woodrow Wilson", LocalDate.of(1914, 7, 28),
				LocalDate.of(1918, 11, 11));
		PresidentDTO presidentDTO5 = new PresidentDTO(6, "Barack Obama", LocalDate.of(2009, 01, 20),
				LocalDate.of(2017, 01, 20));
		PresidentDTO presidentDTO6 = new PresidentDTO(7, "Vladimir Putin", LocalDate.of(2000, 05, 07),
				LocalDate.of(2023, 05, 07));
		PresidentDTO presidentDTO7 = new PresidentDTO(8, "Angela Merkel", LocalDate.of(2005, 11, 22),
				LocalDate.of(2021, 12, 07));
		PresidentDTO presidentDTO8 = new PresidentDTO(9, "Merkel", LocalDate.of(1914, 7, 28),
				LocalDate.of(1918, 11, 11));
		PresidentDTO presidentDTO9 = new PresidentDTO(10, "Nelson Mandela", LocalDate.of(1994, 05, 10),
				LocalDate.of(1999, 06, 14));
		PresidentDTO presidentDTO10 = new PresidentDTO(11, "Theodore Roosevelt", LocalDate.of(1901, 01, 14),
				LocalDate.of(1945, 04, 12));
		PresidentDTO presidentDTO11 = new PresidentDTO(12, "Harry S. Truman", LocalDate.of(1945, 04, 12),
				LocalDate.of(1953, 01, 20));
		PresidentDTO presidentDTO12 = new PresidentDTO(13, "John F. Kennedy", LocalDate.of(1961, 01, 20),
				LocalDate.of(1963, 11, 22));
		PresidentDTO presidentDTO13 = new PresidentDTO(14, "Ronald Reagan", LocalDate.of(1981, 01, 20),
				LocalDate.of(1989, 01, 20));
		PresidentDTO presidentDTO14 = new PresidentDTO(15, "Jimmy Carter", LocalDate.of(1977, 01, 20),
				LocalDate.of(1981, 01, 20));
		PresidentDTO presidentDTO15 = new PresidentDTO(16, "George H.W. Bush", LocalDate.of(1989, 01, 20),
				LocalDate.of(1993, 01, 20));
		PresidentDTO presidentDTO16 = new PresidentDTO(17, "Bill Clinton", LocalDate.of(1993, 01, 20),
				LocalDate.of(2001, 01, 20));
		PresidentDTO presidentDTO17 = new PresidentDTO(18, "Nicholas", LocalDate.of(2001, 01, 20),
				LocalDate.of(2009, 01, 20));
		PresidentDTO presidentDTO18 = new PresidentDTO(19, "Barack Obama", LocalDate.of(2009, 01, 20),
				LocalDate.of(2017, 01, 20));
		PresidentDTO presidentDTO19 = new PresidentDTO(20, "Donald Trump", LocalDate.of(2017, 01, 20),
				LocalDate.of(2021, 01, 20));

		List<PresidentDTO> presidents = new ArrayList<PresidentDTO>();
		presidents.add(presidentDTO);
		presidents.add(presidentDTO1);
		presidents.add(presidentDTO2);
		presidents.add(presidentDTO3);
		presidents.add(presidentDTO4);
		presidents.add(presidentDTO5);
		presidents.add(presidentDTO6);
		presidents.add(presidentDTO7);
		presidents.add(presidentDTO8);
		presidents.add(presidentDTO9);
		presidents.add(presidentDTO10);
		presidents.add(presidentDTO11);
		presidents.add(presidentDTO12);
		presidents.add(presidentDTO13);
		presidents.add(presidentDTO14);
		presidents.add(presidentDTO15);
		presidents.add(presidentDTO16);
		presidents.add(presidentDTO17);
		presidents.add(presidentDTO18);
		presidents.add(presidentDTO19);

		CountryDTO countryDTO = new CountryDTO(1, "Canada", "North America", presidentDTO);
		CountryDTO countryDTO1 = new CountryDTO(2, "United States", "North America", presidentDTO1);
		CountryDTO countryDTO2 = new CountryDTO(3, "Germany", "Europe", presidentDTO2);
		CountryDTO countryDTO3 = new CountryDTO(4, "India", "Asia", presidentDTO3);
		CountryDTO countryDTO4 = new CountryDTO(5, "Australia", "Australia", presidentDTO4);
		CountryDTO countryDTO5 = new CountryDTO(6, "Brazil", "South America", presidentDTO5);
		CountryDTO countryDTO6 = new CountryDTO(7, "Russia", "Europe", presidentDTO6);
		CountryDTO countryDTO7 = new CountryDTO(8, "Germany", "Europe", presidentDTO7);
		CountryDTO countryDTO8 = new CountryDTO(9, "South Africa", "Africa", presidentDTO8);
		CountryDTO countryDTO9 = new CountryDTO(10, "China", "Asia", presidentDTO9);
		CountryDTO countryDTO1O = new CountryDTO(11, "France", "Europe", presidentDTO11);
		CountryDTO countryDTO11 = new CountryDTO(12, "North Korea", "Asia", presidentDTO12);
		CountryDTO countryDTO12 = new CountryDTO(13, "Iran", "North America", presidentDTO13);
		CountryDTO countryDTO13 = new CountryDTO(14, "Egypt", "Africa", presidentDTO14);
		CountryDTO countryDTO14 = new CountryDTO(15, "Argentina", "South America", presidentDTO15);
		CountryDTO countryDTO15 = new CountryDTO(16, "South Korea", "Asia", presidentDTO16);
		CountryDTO countryDTO16 = new CountryDTO(17, "Spain", "Europe", presidentDTO17);
		CountryDTO countryDTO17 = new CountryDTO(18, "Canada", "North America", presidentDTO18);
		CountryDTO countryDTO18 = new CountryDTO(19, "Australia", "Australia", presidentDTO19);
		CountryDTO countryDTO19 = new CountryDTO(20, "America", "South America", presidentDTO10);

		List<CountryDTO> countries = new ArrayList<CountryDTO>();
		countries.add(countryDTO);
		countries.add(countryDTO1);
		countries.add(countryDTO2);
		countries.add(countryDTO3);
		countries.add(countryDTO4);
		countries.add(countryDTO5);
		countries.add(countryDTO6);
		countries.add(countryDTO7);
		countries.add(countryDTO8);
		countries.add(countryDTO9);
		countries.add(countryDTO1O);
		countries.add(countryDTO11);
		countries.add(countryDTO12);
		countries.add(countryDTO13);
		countries.add(countryDTO14);
		countries.add(countryDTO15);
		countries.add(countryDTO16);
		countries.add(countryDTO17);
		countries.add(countryDTO18);
		countries.add(countryDTO19);

		List<CountryDTO> countries1 = new ArrayList<CountryDTO>();
		countries1.add(countryDTO19);
		countries1.add(countryDTO14);
		countries1.add(countryDTO16);

		List<CountryDTO> countries2 = new ArrayList<CountryDTO>();
		countries2.add(countryDTO9);
		countries2.add(countryDTO1O);
		countries2.add(countryDTO8);
		countries2.add(countryDTO12);

		List<CountryDTO> countries3 = new ArrayList<CountryDTO>();
		countries3.add(countryDTO2);
		countries3.add(countryDTO19);
		countries3.add(countryDTO13);

		List<CountryDTO> countries4 = new ArrayList<CountryDTO>();
		countries4.add(countryDTO15);
		countries4.add(countryDTO11);

		List<CountryDTO> countries5 = new ArrayList<CountryDTO>();
		countries5.add(countryDTO2);
		countries5.add(countryDTO14);
		countries5.add(countryDTO5);
		countries5.add(countryDTO6);

		List<CountryDTO> countries6 = new ArrayList<CountryDTO>();
		countries6.add(countryDTO1);
		countries6.add(countryDTO14);
		countries6.add(countryDTO12);

		List<CountryDTO> countries7 = new ArrayList<CountryDTO>();
		countries7.add(countryDTO1);
		countries7.add(countryDTO14);
		countries7.add(countryDTO16);

		List<CountryDTO> countries8 = new ArrayList<CountryDTO>();
		countries8.add(countryDTO12);
		countries8.add(countryDTO14);
		countries8.add(countryDTO16);

		WarDTO warDTO = new WarDTO(1, "American Civil War", LocalDate.of(1861, 04, 12), LocalDate.of(1865, 05, 07),
				"America", countries1);
		WarDTO warDTO1 = new WarDTO(2, "World War 1", LocalDate.of(1939, 9, 1), LocalDate.of(1945, 04, 02),
				"Axis Powers", countries);
		WarDTO warDTO2 = new WarDTO(3, "World War 2", LocalDate.of(1914, 7, 28), LocalDate.of(1918, 11, 11), "Japan",
				countries);
		WarDTO warDTO3 = new WarDTO(4, "Vietnam War", LocalDate.of(1955, 11, 01), LocalDate.of(1975, 04, 30),
				"North Vietnam", countries2);
		WarDTO warDTO4 = new WarDTO(5, "Gulf War", LocalDate.of(1990, 06, 02), LocalDate.of(1991, 02, 28), "Iraq",
				countries3);
		WarDTO warDTO5 = new WarDTO(6, "Korean War", LocalDate.of(1950, 06, 25), LocalDate.of(1953, 07, 27),
				"North Korea", countries4);
		WarDTO warDTO6 = new WarDTO(7, "Falklands War", LocalDate.of(1982, 04, 02), LocalDate.of(1982, 06, 14),
				"Argentina", countries5);
		WarDTO warDTO7 = new WarDTO(8, "Iran-Iraq War", LocalDate.of(1980, 05, 22), LocalDate.of(1988, 02, 20), "Iran",
				countries6);
		WarDTO warDTO8 = new WarDTO(9, "World of 1812", LocalDate.of(1812, 06, 18), LocalDate.of(1815, 02, 18),
				"Britain", countries7);
		WarDTO warDTO9 = new WarDTO(10, "First Gulf War", LocalDate.of(1980, 07, 22), LocalDate.of(1988, 07, 20),
				"Iran", countries8);

		List<WarDTO> wars = new ArrayList<WarDTO>();
		wars.add(warDTO);
		wars.add(warDTO1);
		wars.add(warDTO2);
		wars.add(warDTO3);
		wars.add(warDTO4);
		wars.add(warDTO5);
		wars.add(warDTO6);
		wars.add(warDTO7);
		wars.add(warDTO8);
		wars.add(warDTO9);

		wars.forEach(v -> System.out.println(v));

		System.out.println("-----Collect All Presidents-----");
		List<PresidentDTO> presidents1 = wars.stream()
				.flatMap(e -> e.getCountries().stream().map(v -> v.getPresidentDTO())).distinct()
				.collect(Collectors.toList());
		presidents1.stream().sorted().forEach(w -> System.out.println(w));

		System.out.println("-----Collect President By Country Name-----");
		List<PresidentDTO> name = wars.stream().sorted().flatMap(e -> e.getCountries().stream())
				.filter(s -> s.getName().equals("France")).map(v -> v.getPresidentDTO()).distinct()
				.collect(Collectors.toList());
		name.stream().sorted().forEach(e -> System.out.println(e));

		System.out.println("-----Collect All Country Names-----");
		List<CountryDTO> allCountries = wars.stream().sorted().flatMap(e -> e.getCountries().stream())
				.distinct().collect(Collectors.toList());
		allCountries.stream().sorted().forEach(v -> System.out.println(v));

		System.out.println("-----Collect All Continents-----");
		List<String> continents = wars.stream().sorted()
				.flatMap(e -> e.getCountries().stream().map(v -> v.getContinent())).distinct()
				.collect(Collectors.toList());
		continents.stream().sorted().forEach(v -> System.out.println(v));

		System.out.println("------Collect Countries By WarName-----");
		List<CountryDTO> list = wars.stream().sorted().filter(e -> e.getName().equals("Korean War")).flatMap(e->e.getCountries().stream())
				.collect(Collectors.toList());
		list.stream().sorted().forEach(v -> System.out.println(v));

		System.out.println("------Start Date And End Date------");

		List<WarDTO> war = wars.stream().sorted().collect(Collectors.toList());
		war.forEach(e -> System.out.println("Start Date : " + e.getStartDate() + " End Date : " + e.getEndDate()));

		System.out.println("-----Listiterator-----");
		List<String> names = new ArrayList<String>();
		names.add("SRK");
		names.add("Surya");
		names.add("Vijay");
		names.add("Vikram");
		names.add("Kamal");
		names.add("Anirudh");
		names.add("Ayushman");
		names.add("Mohanlal");

		ListIterator<String> actors = names.listIterator(2);
		while (actors.hasPrevious()) {
			Object ele = actors.previous();
			System.out.println(ele);
		}

		System.out.println("---Traversing Backwards---");
		ListIterator<String> actors1 = names.listIterator(names.size());
		while (actors1.hasPrevious()) {
			Object ele = actors1.previous();
			System.out.println(ele);
		}

	}
}
