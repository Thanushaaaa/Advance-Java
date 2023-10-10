package com.xworkz.tin;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ControllerTest {

	public static void main(String[] args) {

		TempleDTO templeDTO = new TempleDTO("Lakshmi", "YNS", "Lakshmi", "Chandana", 2023);
		TempleDTO templeDTO1 = new TempleDTO("Kali", "VSR", "Kali", "Lahari", 2022);
		TempleDTO templeDTO2 = new TempleDTO("Shiv", "HYD", "Shiv", "Nandini", 2021);
		TempleDTO templeDTO3 = new TempleDTO("Hanuman", "BNGLR", "Hanuman", "Shogi", 2020);
		TempleDTO templeDTO4 = new TempleDTO("Krishna", "BHN", "Krishna", "Bhanu", 2020);

		Collection<TempleDTO> collection = new HashSet<TempleDTO>();
		collection.add(templeDTO);
		collection.add(templeDTO1);
		collection.add(templeDTO2);
		collection.add(templeDTO3);
		collection.add(templeDTO4);

		for (TempleDTO ref : collection) {
			System.out.println(ref.getName());
		}
		System.out.println("Iterator");

		Iterator<TempleDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			TempleDTO ele = iterator.next();
			System.out.println(ele.getName());

			if (ele.getName().equals("Kali")) {
				iterator.remove();
			}
		}
	}

}
