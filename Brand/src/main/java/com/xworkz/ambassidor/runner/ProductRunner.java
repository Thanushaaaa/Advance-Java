package com.xworkz.ambassidor.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.ambassior.dto.AddressDTO;
import com.xworkz.ambassior.dto.BrandDTO;
import com.xworkz.ambassior.dto.ProductDTO;
import com.xworkz.ambassior.dto.ProductType;

public class ProductRunner {

	public static void main(String[] args) {

		AddressDTO addressDTO1 = new AddressDTO(1, 34, "Gandi Nagar", "Hyd", "Telangana", 515245);
		AddressDTO addressDTO2 = new AddressDTO(2, 35, "Gandi Nagar1", "Hyd1", "Telangana1", 515246);
		AddressDTO addressDTO3 = new AddressDTO(3, 34, "Gandi Nagar2", "Hyd2", "Telangana2", 515247);
		AddressDTO addressDTO4 = new AddressDTO(4, 34, "Gandi Nagar3", "Hyd3", "Telangana3", 515248);
		AddressDTO addressDTO5 = new AddressDTO(5, 34, "Gandi Nagar4", "Hyd4", "Telangana4", 515249);
		AddressDTO addressDTO6 = new AddressDTO(6, 34, "Gandi Nagar5", "Hyd5", "Telangana5", 515250);
		AddressDTO addressDTO7 = new AddressDTO(7, 34, "Gandi Nagar6", "Hyd6", "Telangana6", 515251);
		AddressDTO addressDTO8 = new AddressDTO(8, 34, "Gandi Nagar7", "Hyd7", "Telangana7", 515252);
		AddressDTO addressDTO9 = new AddressDTO(9, 34, "Gandi Nagar8", "Hyd8", "Telangana8", 515253);
		AddressDTO addressDTO10 = new AddressDTO(10, 34, "Gandi Nagar9", "Hyd9", "Telangana9", 515255);

		BrandDTO brandDTO1 = new BrandDTO(1, "Gucci", "AB123456", addressDTO1, LocalDate.of(2013, 6, 19));
		BrandDTO brandDTO2 = new BrandDTO(2, "Gucci", "AC123456", addressDTO2, LocalDate.of(2012, 6, 19));
		BrandDTO brandDTO3 = new BrandDTO(3, "Gucci", "DB123456", addressDTO3, LocalDate.of(2011, 6, 19));
		BrandDTO brandDTO4 = new BrandDTO(4, "Gucci", "AB123456", addressDTO4, LocalDate.of(2009, 6, 19));
		BrandDTO brandDTO5 = new BrandDTO(5, "Gucci", "EF123456", addressDTO5, LocalDate.of(2010, 6, 19));
		BrandDTO brandDTO6 = new BrandDTO(6, "Gucci", "AB123456", addressDTO6, LocalDate.of(2018, 6, 19));
		BrandDTO brandDTO7 = new BrandDTO(7, "Gucci", "CH123456", addressDTO7, LocalDate.of(2007, 6, 19));
		BrandDTO brandDTO8 = new BrandDTO(8, "Gucci", "NB123956", addressDTO8, LocalDate.of(2006, 6, 19));
		BrandDTO brandDTO9 = new BrandDTO(9, "Gucci", "AB123456", addressDTO9, LocalDate.of(2005, 6, 19));
		BrandDTO brandDTO10 = new BrandDTO(10, "Gucci", "CB023456", addressDTO10, LocalDate.of(2004, 6, 19));

		ProductDTO productDTO1 = new ProductDTO(1, "bag", ProductType.TRAVEL, brandDTO1, 1275, 6);
		ProductDTO productDTO2 = new ProductDTO(2, "bag", ProductType.BEAUTY, brandDTO2, 1675, 1);
		ProductDTO productDTO3 = new ProductDTO(3, "Vessel", ProductType.TRAVEL, brandDTO3, 1675, 5);
		ProductDTO productDTO4 = new ProductDTO(4, "bag", ProductType.ELECTRONICS, brandDTO4, 1675, 4);
		ProductDTO productDTO5 = new ProductDTO(5, "Bowl", ProductType.TRAVEL, brandDTO5, 1675, 3);
		ProductDTO productDTO6 = new ProductDTO(6, "bag", ProductType.FURNITURE, brandDTO6, 1675, 9);
		ProductDTO productDTO7 = new ProductDTO(7, "Bottle", ProductType.KITCHEN_APP, brandDTO7, 1575, 10);
		ProductDTO productDTO8 = new ProductDTO(8, "bag", ProductType.BEAUTY, brandDTO8, 1675, 18);
		ProductDTO productDTO9 = new ProductDTO(9, "bag", ProductType.KITCHEN_APP, brandDTO9, 1675, 14);
		ProductDTO productDTO10 = new ProductDTO(10, "bag", ProductType.TRAVEL, brandDTO10, 1575, 11);

		Collection<ProductDTO> product = new ArrayList<ProductDTO>();
		product.add(productDTO1);
		product.add(productDTO2);
		product.add(productDTO3);
		product.add(productDTO4);
		product.add(productDTO5);
		product.add(productDTO6);
		product.add(productDTO7);
		product.add(productDTO8);
		product.add(productDTO9);
		product.add(productDTO10);

		product.stream().forEach(e -> System.out.println(e));

		System.out.println("-----Get all ProductDTO by pincode sort by Desc");
		List<AddressDTO> pincode = product.stream().map(v -> v.getBrand().getAddress())
				.sorted((a1, a2) -> Integer.compare(a2.getPincode(), a1.getPincode()))
				.filter(v -> v.getPincode().equals(v.getPincode())).collect(Collectors.toList());
		pincode.forEach(v -> System.out.println(v));

		System.out.println("* Get all AddressDTO by product name sort by id desc order *");
		Optional<ProductDTO> name = product.stream().sorted((a1, a2) -> Integer.compare(a2.getId(), a1.getId()))
				.filter(p -> p.getName().equals("Bowl")).collect(Collectors.toList()).stream()
				.max((a1, a2) -> a2.compareTo(a1));
		if (name.isPresent()) {
			System.out.println(name);

		}

		System.out.println("----ProductDTO by BrandDTO");

		List<ProductDTO> products = product.stream().filter(e -> e.getBrand().equals(brandDTO1))
				.collect(Collectors.toList());

		products.forEach(System.out::println);

		System.out.println("----ProductDTO by type----");
		List<ProductDTO> products4 = product.stream().filter(e -> e.getProductType().equals(ProductType.KITCHEN_APP))
				.collect(Collectors.toList());

		products4.forEach(System.out::println);

		System.out.println("-----Sort by quantity-----");

		List<ProductDTO> quantity = product.stream()
				.sorted((p1, p2) -> Integer.compare(p2.getQuantity(), p1.getQuantity())).collect(Collectors.toList());

		quantity.forEach(System.out::println);

		System.out.println("----Get ProductDTO by max price----");

		ProductDTO price = product.stream().filter(pr -> pr.getPrice() <= 2000)
				.sorted((p1, p2) -> p2.getPrice().compareTo(p1.getPrice())).findFirst().get();
		System.out.println(price);
		List<String> names = new ArrayList<String>();
		names.add("SRK");
		names.add("Anirudh");
		names.add("Vikas");
		names.add("Arjun");
		names.add("Ajay");
		names.add("Neha");

		System.out.println("----Iterator----");

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}

		System.out.println("----List iterator-----");

		ListIterator<String> names2 = names.listIterator(2);

		System.out.println("----Printing elements in reverse order----");
		while (names2.hasPrevious()) {
			String ele = names2.previous();
			System.out.println(ele);
		}
		System.out.println("----Printing elements from specified index----");
		while (names2.hasNext()) {
			String ele = names2.next();
			System.out.println(ele);
		}

	}
}
