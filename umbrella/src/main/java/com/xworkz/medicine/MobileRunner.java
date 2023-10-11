package com.xworkz.medicine;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class MobileRunner {

	public static void main(String[] args) {
		Collection<Long> numbers = new HashSet<Long>();
		numbers.add(9109654321L);
		numbers.add(9209654321L);
		numbers.add(9109653321L);
		numbers.add(9149654321L);
		numbers.add(9159654321L);
		numbers.add(9609654321L);
		numbers.add(9709654321L);
		numbers.add(9809654321L);
		numbers.add(9909654321L);
		numbers.add(9119654321L);

		boolean check = Collections.addAll(numbers, 9121660983L);
		System.out.println(check);

		boolean check1 = numbers.remove(9709654321L);
		System.out.println(check1);
		if (numbers.contains(9119654321L)) {
			System.out.println("Contains number");
		}
		System.out.println(numbers.size());

		Iterator<Long> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			Long ele = iterator.next();
			System.out.println(ele);
		}
		Collection<String> emails1 = new HashSet<String>();
		Collection<Long> numbers1 = new HashSet<Long>();
		numbers1.add(9109654321L);
		numbers1.add(9209654321L);
		numbers1.add(9109653321L);
		numbers1.add(9149654321L);
		numbers1.add(9159654321L);
		numbers1.add(9609654321L);
		numbers1.add(9709654321L);
		numbers1.add(9809654321L);
		numbers1.add(9909654321L);
		numbers1.add(8909654321L);

		System.out.println(numbers.containsAll(numbers1));
		boolean check2 = numbers.removeAll(numbers1);
		System.out.println(check2);
		boolean check3 = numbers.retainAll(numbers1);
		System.out.println(check3);

		if (numbers.isEmpty()) {
			System.out.println("Empty");
		}

		Object[] array = numbers1.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
