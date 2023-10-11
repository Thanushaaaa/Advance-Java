package com.xworkz.medicine;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class MailRunner {

	public static void main(String[] args) {
		Collection<String> emails = new HashSet<String>();
		emails.add("pthanusha@gmail.com");
		emails.add("chandana@gmail.com");
		emails.add("lahari@gmail.com");
		emails.add("nandini@gmail.com");
		emails.add("shogi@gmail.com");
		emails.add("geetha@gmail.com");
		emails.add("meghana@gmail.com");
		emails.add("sravani@gmail.com");
		emails.add("shilpa@gmail.com");
		emails.add("bhanu@gmail.com");

		boolean check = Collections.addAll(emails, "aasha@gmail.com", "sneha@gmail.com");
		System.out.println(check);

		boolean check1 = emails.remove("meghana@gmail.com");
		System.out.println(check1);

		if (emails.contains("bhanu@gmail.com")) {
			System.out.println("Contains Bhanu");
		}
		System.out.println(emails.size());

		Iterator<String> iterator = emails.iterator();

		while (iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println(ele);
		}
		Collection<String> emails1 = new HashSet<String>();
		emails1.add("pthanusha@gmail.com");
		emails1.add("chandana@gmail.com");
		emails1.add("lahari@gmail.com");
		emails1.add("nandini@gmail.com");
		emails1.add("shogi@gmail.com");
		emails1.add("geetha@gmail.com");
		emails1.add("sravani@gmail.com");
		emails1.add("shilpa@gmail.com");
		emails1.add("bhanu@gmail.com");
		System.out.println(emails.containsAll(emails1));
		boolean check2 = emails.removeAll(emails1);
		System.out.println(check2);
		boolean check3 = emails.retainAll(emails1);
		System.out.println(check3);
		if (emails1.isEmpty()) {
			System.out.println("Empty");
		}

		Object[] array = emails1.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
