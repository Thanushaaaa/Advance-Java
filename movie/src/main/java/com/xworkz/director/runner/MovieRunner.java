package com.xworkz.director.runner;

import java.util.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

import com.xworkz.director.dto.MovieDTO;
import com.xworkz.director.dto.MovieLanguage;

public class MovieRunner {

	public static void main(String[] args) {
		MovieDTO movieDTO = new MovieDTO(1, "Bahubali", "RK", "Rajamouli", 176543298, MovieLanguage.TELUGU);
		MovieDTO movieDTO1 = new MovieDTO(2, "Bommarillu", "Ravi", "Bhaskar", 65432, MovieLanguage.TELUGU);
		MovieDTO movieDTO2 = new MovieDTO(3, "Athadu", "Trivikram", "Sonu sood", 156543289, MovieLanguage.TELUGU);
		MovieDTO movieDTO3 = new MovieDTO(4, "Manmadhudu", "Vijay", "Anshu", 45432, MovieLanguage.TELUGU);
		MovieDTO movieDTO4 = new MovieDTO(5, "Nayakan", "Manirathnam", "RajaSri", 165432098, MovieLanguage.HINDI);
		MovieDTO movieDTO5 = new MovieDTO(6, "3Idiots", "Ankith", "Bhaskar", 965432, MovieLanguage.HINDI);
		MovieDTO movieDTO6 = new MovieDTO(7, "Jai Bhim", "Kiran", "Gnanaveli", 156543209, MovieLanguage.HINDI);
		MovieDTO movieDTO7 = new MovieDTO(8, "Dangal", "RK", "Nithesh Tiwari", 465432, MovieLanguage.HINDI);
		MovieDTO movieDTO8 = new MovieDTO(9, "The GrandFather", "Mario Puzo", "James Caan", 167543298,
				MovieLanguage.ENGLISH);
		MovieDTO movieDTO9 = new MovieDTO(10, "The Dark Knight", "David Goyer", "Christopher Nolan", 650432,
				MovieLanguage.ENGLISH);
		MovieDTO movieDTO10 = new MovieDTO(11, "Pulp fiction", "Roger Avary", "John", 996543298, MovieLanguage.ENGLISH);
		MovieDTO movieDTO11 = new MovieDTO(12, "Inception", "Alen", "Christopher Nolan", 565432, MovieLanguage.ENGLISH);
		MovieDTO movieDTO12 = new MovieDTO(13, "Lucia", "Achyuth", "Pavan kumar", 165432, MovieLanguage.KANNADA);
		MovieDTO movieDTO13 = new MovieDTO(14, "Thithi", "Raam Reddy", "Arjun", 677654329, MovieLanguage.KANNADA);
		MovieDTO movieDTO14 = new MovieDTO(15, "Ugram", "Tilak", "Prasanth Neel", 765732, MovieLanguage.KANNADA);
		MovieDTO movieDTO15 = new MovieDTO(16, "Upendra", "Raveena", "Upendra", 065432, MovieLanguage.KANNADA);
		MovieDTO movieDTO16 = new MovieDTO(17, "Angrej", "smriti Singh", "Amberdeep", 216543298, MovieLanguage.PUNJABI);
		MovieDTO movieDTO17 = new MovieDTO(18, "Qismat", "Jagdeep", "S", 765432, MovieLanguage.PUNJABI);
		MovieDTO movieDTO18 = new MovieDTO(19, "Shareek", "Navniath Singh", "Mukul Dev", 265432, MovieLanguage.PUNJABI);

		Collection<MovieDTO> collection = new HashSet<MovieDTO>();

		collection.add(movieDTO);
		collection.add(movieDTO1);
		collection.add(movieDTO2);
		collection.add(movieDTO3);
		collection.add(movieDTO4);
		collection.add(movieDTO5);
		collection.add(movieDTO6);
		collection.add(movieDTO7);
		collection.add(movieDTO8);
		collection.add(movieDTO9);
		collection.add(movieDTO10);
		collection.add(movieDTO11);
		collection.add(movieDTO12);
		collection.add(movieDTO13);
		collection.add(movieDTO14);
		collection.add(movieDTO15);
		collection.add(movieDTO16);
		collection.add(movieDTO17);
		collection.add(movieDTO18);

		Collection<MovieDTO> collection1 = new HashSet<MovieDTO>();

		collection.forEach((a) -> {
			if (a.getMovieLanguage().equals(MovieLanguage.TELUGU)) {
				collection1.add(a);
			}
		});

		collection1.forEach((a) -> {
			System.out.println(a);

		});

		System.out.println("---Producer---");

		Collection<MovieDTO> collection2 = new HashSet<MovieDTO>();

		collection.forEach((a) -> {
			if (a.getProducer().equals("RK")) {
				collection2.add(a);
			}
		});

		collection2.forEach((a) -> {
			System.out.println(a);

		});

		System.out.println("---Director---");

		Collection<MovieDTO> collection3 = new HashSet<MovieDTO>();

		collection.forEach((a) -> {
			if (a.getDirector().equals("Bhaskar")) {
				collection3.add(a);
			}
		});

		collection3.forEach((a) -> {
			System.out.println(a);

		});

		System.out.println("---Budget greater than one crore---");

		Collection<MovieDTO> collection4 = new HashSet<MovieDTO>();

		collection.forEach((a) -> {
			if (a.getBudget() > 10000000) {
				collection4.add(a);
			}
		});

		collection4.forEach((a) -> {
			System.out.println(a);

		});

		System.out.println("---Removing films with a budget of less than one crore---");

		Iterator<MovieDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			MovieDTO ele = iterator.next();
			if (ele.getBudget() < 10000000) {

				System.out.println("Films with a budget of less than one crore " + ele.getName());
				iterator.remove();
			}
		}
		collection.forEach((a) -> {
			System.out.println(a);

		});

	}

}
