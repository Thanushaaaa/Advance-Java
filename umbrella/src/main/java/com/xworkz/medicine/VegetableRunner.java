package com.xworkz.medicine;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class VegetableRunner {
	public static void main(String[] args) {

		VegetableDTO vegetableDTO = new VegetableDTO(1, "Onions", 80, 5);
		VegetableDTO vegetableDTO1 = new VegetableDTO(2, "Potatoes", 70, 4);
		VegetableDTO vegetableDTO2 = new VegetableDTO(3, "Chilli", 160, 3);
		VegetableDTO vegetableDTO3 = new VegetableDTO(4, "Mushroom", 50, 6);
		VegetableDTO vegetableDTO4 = new VegetableDTO(5, "Carrot", 40, 7);
		VegetableDTO vegetableDTO5 = new VegetableDTO(6, "Brinjal", 130, 5);
		VegetableDTO vegetableDTO6 = new VegetableDTO(7, "Beans", 120, 4);
		VegetableDTO vegetableDTO7 = new VegetableDTO(8, "Cabbage", 140, 3);
		VegetableDTO vegetableDTO8 = new VegetableDTO(9, "Cauliflower", 150, 2);
		VegetableDTO vegetableDTO9 = new VegetableDTO(10, "Beetroot", 60, 1);
		VegetableDTO vegetableDTO10 = new VegetableDTO(11, "Ginger", 40, 7);

		Collection<VegetableDTO> vegetable = new HashSet<VegetableDTO>();

		vegetable.add(vegetableDTO);
		vegetable.add(vegetableDTO1);
		vegetable.add(vegetableDTO2);
		vegetable.add(vegetableDTO3);
		vegetable.add(vegetableDTO4);
		vegetable.add(vegetableDTO5);
		vegetable.add(vegetableDTO6);
		vegetable.add(vegetableDTO7);
		vegetable.add(vegetableDTO8);
		vegetable.add(vegetableDTO9);

		Collection<VegetableDTO> newVegetable = new HashSet<VegetableDTO>();

		vegetable.forEach((s) -> {
			if (s.getPrice() > 100) {
				System.out.println("Price is high " + s.getName());
			} else {
				newVegetable.add(s);
			}
		});

		newVegetable.forEach((p) -> {
			System.out.println(p.getName());

		});

		boolean check = Collections.addAll(vegetable, vegetableDTO10);
		System.out.println(check);

		boolean check1 = vegetable.remove(vegetableDTO7);
		System.out.println(check1);
		if (vegetable.contains(vegetableDTO)) {
			System.out.println("Contains vegetableDTO");
		}
		System.out.println(vegetable.size());
		Iterator<VegetableDTO> iterator = vegetable.iterator();

		while (iterator.hasNext()) {
			VegetableDTO ele = iterator.next();
			System.out.println(ele.getName());
		}
		Collection<VegetableDTO> vegetables = new HashSet<VegetableDTO>();
		vegetables.add(vegetableDTO);
		vegetables.add(vegetableDTO1);
		vegetables.add(vegetableDTO2);
		vegetables.add(vegetableDTO3);
		vegetables.add(vegetableDTO4);
		vegetables.add(vegetableDTO5);
		vegetables.add(vegetableDTO6);
		vegetables.add(vegetableDTO7);
		vegetables.add(vegetableDTO8);
		vegetables.add(vegetableDTO9);
		System.out.println(vegetable.containsAll(vegetables));

		boolean check2 = vegetable.removeAll(vegetables);
		System.out.println(check2);
		boolean check3 = vegetable.retainAll(vegetables);
		System.out.println(check3);

		if (vegetable.isEmpty()) {
			System.out.println("Empty");
		}

		Object[] array = vegetables.toArray();
		System.out.println(array.length);

	}
}
