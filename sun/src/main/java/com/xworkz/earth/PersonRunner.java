package com.xworkz.earth;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonRunner {

	public static void main(String[] args) {

		PersonDTO person1 = new PersonDTO(1, "Ankith", "ankith1233@gmail.com", 9823457618L);
		PersonDTO person2 = new PersonDTO(2, "Reena", "reena12@gmail.com", 9823457639L);
		PersonDTO person3 = new PersonDTO(3, "Mukesh", "mukesh34@gmail.com", 9823457640L);
		PersonDTO person4 = new PersonDTO(4, "Sushma", "sushma56@gmail.com", 9823457641L);
		PersonDTO person5 = new PersonDTO(5, "Hitesh", "hitesh78@gmail.com", 9823457642L);
		PersonDTO person6 = new PersonDTO(6, "Sunita", "sunita90@gmail.com", 9823457643L);
		PersonDTO person7 = new PersonDTO(7, "Varun", "varun123@gmail.com", 9823457644L);
		PersonDTO person8 = new PersonDTO(8, "Meera", "meera567@gmail.com", 9823457645L);
		PersonDTO person9 = new PersonDTO(9, "Avinash", "avinash890@gmail.com", 9823457646L);
		PersonDTO person10 = new PersonDTO(10, "Kiran", "kiran1234@gmail.com", 9823457647L);

		PassportDTO passport1 = new PassportDTO(1, "N3451236", LocalDate.of(2011, 11, 01), "India",
				LocalDate.of(2019, 11, 01), PassportType.CHILD_PASSPORT);
		PassportDTO passport2 = new PassportDTO(2, "J1234567", LocalDate.of(2012, 6, 2), "Mexico",
				LocalDate.of(2022, 6, 2), PassportType.REGULAR_PASSPORT);

		PassportDTO passport3 = new PassportDTO(3, "K5678901", LocalDate.of(2025, 1, 30), "Spain",
				LocalDate.of(2026, 1, 30), PassportType.TEMPORARY_PASSPORT);

		PassportDTO passport4 = new PassportDTO(4, "L8901234", LocalDate.of(2024, 4, 9), "Italy",
				LocalDate.of(2024, 4, 9), PassportType.REFUGEE_PASSPORT);

		PassportDTO passport5 = new PassportDTO(5, "M2345678", LocalDate.of(2018, 7, 14), "Russia",
				LocalDate.of(2028, 7, 14), PassportType.CHILD_PASSPORT);

		PassportDTO passport6 = new PassportDTO(6, "N6789012", LocalDate.of(2015, 11, 22), "China",
				LocalDate.of(2025, 11, 22), PassportType.REGULAR_PASSPORT);

		PassportDTO passport7 = new PassportDTO(7, "O9012345", LocalDate.of(2017, 2, 11), "Switzerland",
				LocalDate.of(2027, 2, 11), PassportType.TEMPORARY_PASSPORT);

		PassportDTO passport8 = new PassportDTO(8, "P3456789", LocalDate.of(2027, 9, 17), "Netherlands",
				LocalDate.of(2023, 9, 17), PassportType.OFFICIAL_PASSPORT);

		PassportDTO passport9 = new PassportDTO(9, "Q7890123", LocalDate.of(2019, 4, 5), "Sweden",
				LocalDate.of(2020, 4, 5), PassportType.REFUGEE_PASSPORT);

		PassportDTO passport10 = new PassportDTO(10, "R1234567", LocalDate.of(2016, 8, 28), "Singapore",
				LocalDate.of(2026, 8, 28), PassportType.TEMPORARY_PASSPORT);

		Map<PersonDTO, PassportDTO> details = new HashMap<PersonDTO, PassportDTO>();
		details.put(person1, passport1);
		details.put(person2, passport2);
		details.put(person3, passport3);
		details.put(person4, passport4);
		details.put(person5, passport5);
		details.put(person6, passport6);
		details.put(person7, passport7);
		details.put(person8, passport8);
		details.put(person9, passport9);
		details.put(person10, passport10);

		System.out.println("---Collect all PersonDTO---");
		Set<PersonDTO> persons = details.keySet().stream().collect(Collectors.toSet());
		persons.forEach(System.out::println);

		System.out.println("---Collect all PassportDTO---");
		Set<PassportDTO> passports = details.values().stream().collect(Collectors.toSet());
		passports.forEach(System.out::println);

		System.out.println("---Collect all Passport by type---");
		Set<PassportDTO> passportsType = details.values().stream()
				.filter(e -> e.getPassportType().equals(PassportType.REGULAR_PASSPORT)).collect(Collectors.toSet());

		passportsType.forEach(System.out::println);

		System.out.println("---Collect all Passport by issuedDate less than todays date---");
		Set<PassportDTO> passportsDate = details.values().stream()
				.filter(e -> e.getIssuedDate().isBefore(LocalDate.now())).collect(Collectors.toSet());

		passportsDate.forEach(System.out::println);

		System.out.println("---Collect all expired passport---");
		Set<PassportDTO> passportsExpired = details.values().stream()
				.filter(e -> e.getExpiryDate().isBefore(LocalDate.now())).collect(Collectors.toSet());

		passportsExpired.forEach(System.out::println);

		System.out.println("---Get person by name---");
		Optional<PersonDTO> optional = details.keySet().stream().filter(e -> e.getName().equals("Varun")).findFirst();
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
		System.out.println("---Get passport by number---");
		Optional<PassportDTO> optional1 = details.values().stream().filter(e -> e.getNumber().equals("R1234567"))
				.findFirst();
		if (optional1.isPresent()) {
			System.out.println(optional1.get());
		}

	}

}
