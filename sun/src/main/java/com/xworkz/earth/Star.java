package com.xworkz.earth;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Star {

	public static void main(String[] args) {

		Map<Long, String> numbers = new HashMap<Long, String>();
		numbers.put(9121669765L, "Chandana");
		numbers.put(8976543209L, "Lahari");
		numbers.put(9762134567L, "Nandini");
		numbers.put(7654321897L, "Arjun Tendulkar");
		numbers.put(8543217899L, "Narayana Murthy");
		numbers.put(9807654890L, "Jayanth");
		numbers.put(8976123461L, "Ankith");
		numbers.put(8907658907L, "Akarsh");
		numbers.put(9800765478L, "Vandana");
		numbers.put(7893412870L, "Bhanu");
		numbers.put(9008907690L, "Aradhya");
		numbers.put(8997094567L, "Sachin");
		numbers.put(9009456789L, "Dhoni");
		numbers.put(8121669765L, "Vidya");
		numbers.put(7121669765L, "Priya");
		numbers.put(9122669765L, "Surya");
		numbers.put(7221669765L, "Vinay");
		numbers.put(9014219348L, "Chaithra");
		numbers.put(9121779765L, "Anjali");
		numbers.put(8621669765L, "Vikram");

		System.out.println("---Collect names with characters more than 10---");
		Set<String> characters = numbers.values().stream().filter(e -> e.length() > 10).collect(Collectors.toSet());
		characters.forEach(System.out::println);

		System.out.println("---Collect names with characters less than 10---");
		Set<String> characters1 = numbers.values().stream().filter(e -> e.length() < 10).collect(Collectors.toSet());
		characters1.forEach(System.out::println);

		System.out.println("---Collect all names in uppercase---");
		Set<String> names = numbers.values().stream().map(e -> e.toUpperCase()).collect(Collectors.toSet());
		names.forEach(System.out::println);

		System.out.println("---Collect all mobile numbers ending with 0---");
		Set<Long> numbers1 = numbers.keySet().stream().filter(e -> e.toString().endsWith("0"))
				.collect(Collectors.toSet());
		numbers1.forEach(System.out::println);

		System.out.println("---Collect all mobile numbers starting with 8---");
		Set<Long> numbers2 = numbers.keySet().stream().filter(e -> e.toString().startsWith("8"))
				.collect(Collectors.toSet());
		numbers2.forEach(System.out::println);

		System.out.println("---Printing both keys and values---");
		Set<Entry<Long, String>> ref = numbers.entrySet();
		System.out.println(ref);

	}

}
