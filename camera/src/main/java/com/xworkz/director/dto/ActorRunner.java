package com.xworkz.director.dto;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ActorRunner {

	public static void main(String[] args) {
		ActorDTO actorDTO = new ActorDTO(1, "SRK", "Hindi", "Male", "India");
		ActorDTO actorDTO1 = new ActorDTO(2, "Hina Khan", "Urdu", "Female", "Pakistan");
		ActorDTO actorDTO2 = new ActorDTO(3, "Cilian Murphy", "English", "Male", "USA");
		ActorDTO actorDTO3 = new ActorDTO(4, "Tom", "English", "Male", "England");
		ActorDTO actorDTO4 = new ActorDTO(5, "Jackson Wang", "Korean", "Male", "South Korea");
		ActorDTO actorDTO5 = new ActorDTO(6, "Surya", "Tamil", "Male", "India");

		Collection<ActorDTO> actor = new HashSet<ActorDTO>();

		actor.add(actorDTO);
		actor.add(actorDTO1);
		actor.add(actorDTO2);
		actor.add(actorDTO3);
		actor.add(actorDTO4);
		actor.add(actorDTO5);

		System.out.println("*** Actors in Desc order by name ***");
		List<ActorDTO> actorList = actor.stream().sorted().collect(Collectors.toList());
		actorList.forEach((e) -> System.out.println(e.getName()));
		System.out.println("*** Country in Uppercase in Desc order ***");
		List<String> country = actor.stream().sorted().map((e) -> e.getCountry().toUpperCase())
				.collect(Collectors.toList());

		country.forEach((e) -> System.out.println(e));
		System.out.println("*** Id in Asc order ***");
		List<Integer> list = actor.stream().map(e -> e.getId()).sorted((a1, a2) -> a1.compareTo(a2))
				.collect(Collectors.toList());

		list.forEach(e -> System.out.println(e));
		System.out.println("*** Actors in Asc order by LangKnown ***");
		List<ActorDTO> lang = actor.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.filter((e) -> e.getLangKnown().equals("English")).collect(Collectors.toList());

		lang.forEach(e -> System.out.println(e));
		System.out.println("*** Actors in Desc order by LangKnown ***");
		List<ActorDTO> langDesc = actor.stream().sorted().filter((e) -> e.getLangKnown().equals("English"))
				.collect(Collectors.toList());

		langDesc.forEach(e -> System.out.println(e));
		System.out.println("*** Actors by Male ***");
		actor.stream().sorted().filter((e) -> e.getGender().equals("Male")).forEach(e -> System.out.println(e));
		System.out.println("*** Actors by Female ***");
		List<ActorDTO> female = actor.stream().sorted().filter(e -> e.getGender().equals("Female"))
				.collect(Collectors.toList());

		female.forEach(e -> System.out.println(e));
		System.out.println("*** Filter by all Country and Count ***");
		List<ActorDTO> countries = actor.stream().sorted().filter((e) -> e.getCountry().equals("India"))
				.collect(Collectors.toList());
		countries.forEach(e -> System.out.println(e));
		System.out.println("Count :" + countries.size());

		System.out.println("*** Id>5 and sort in Asc order ***");
		List<ActorDTO> id = actor.stream().filter(e -> e.getId() > 5).sorted((a1, a2) -> a1.compareTo(a2))
				.collect(Collectors.toList());

		id.forEach(e -> System.out.println(e));
	}
}
