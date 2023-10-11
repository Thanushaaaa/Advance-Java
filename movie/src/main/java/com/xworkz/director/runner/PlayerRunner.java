package com.xworkz.director.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.director.dto.PlayerDTO;
import com.xworkz.director.dto.PlayerSport;

public class PlayerRunner {

	public static void main(String[] args) {

		PlayerDTO playerDTO = new PlayerDTO(1, "Gill", "India", 25, PlayerSport.CRICKET);
		PlayerDTO playerDTO1 = new PlayerDTO(2, "Ishan", "India", 22, PlayerSport.CRICKET);
		PlayerDTO playerDTO2 = new PlayerDTO(3, "Maxwell", "Australia", 34, PlayerSport.CRICKET);
		PlayerDTO playerDTO3 = new PlayerDTO(4, "Murphy", "Australia", 22, PlayerSport.CRICKET);
		PlayerDTO playerDTO4 = new PlayerDTO(5, "Christiano Ronaldo", "Portugal", 38, PlayerSport.FOOTBALL);
		PlayerDTO playerDTO5 = new PlayerDTO(6, "Sunil chetthri", "India", 35, PlayerSport.FOOTBALL);
		PlayerDTO playerDTO6 = new PlayerDTO(7, "Lionel Messi", "Argentina", 40, PlayerSport.FOOTBALL);
		PlayerDTO playerDTO7 = new PlayerDTO(8, "Mbappe", "France", 38, PlayerSport.FOOTBALL);
		PlayerDTO playerDTO8 = new PlayerDTO(9, "Sania Mirza", "India", 35, PlayerSport.TENNIS);
		PlayerDTO playerDTO9 = new PlayerDTO(10, "Nirupama Sanjeev", "India", 45, PlayerSport.TENNIS);
		PlayerDTO playerDTO10 = new PlayerDTO(11, "Djokovic", "Serbia", 35, PlayerSport.TENNIS);
		PlayerDTO playerDTO11 = new PlayerDTO(12, "Zerev", "Germany", 35, PlayerSport.TENNIS);
		PlayerDTO playerDTO12 = new PlayerDTO(13, "Ashwal Rai", "India", 35, PlayerSport.VOLLEYBALL);
		PlayerDTO playerDTO13 = new PlayerDTO(14, "Karthik Madhu", "India", 31, PlayerSport.VOLLEYBALL);
		PlayerDTO playerDTO14 = new PlayerDTO(15, "Benjamin Hardy", "Australia", 38, PlayerSport.VOLLEYBALL);
		PlayerDTO playerDTO15 = new PlayerDTO(16, "Steve Keir", "Australia", 31, PlayerSport.VOLLEYBALL);
		PlayerDTO playerDTO16 = new PlayerDTO(17, "Raspreet Siddhu", "India", 30, PlayerSport.BASKETBALL);
		PlayerDTO playerDTO17 = new PlayerDTO(18, "Trideep Rai", "India", 32, PlayerSport.BASKETBALL);
		PlayerDTO playerDTO18 = new PlayerDTO(19, "Hakeem Olajuwan", "Nigeria", 28, PlayerSport.BASKETBALL);
		PlayerDTO playerDTO19 = new PlayerDTO(20, "Dirk", "Argentina", 29, PlayerSport.BASKETBALL);

		Collection<PlayerDTO> collection = new HashSet<PlayerDTO>();

		collection.add(playerDTO);
		collection.add(playerDTO1);
		collection.add(playerDTO2);
		collection.add(playerDTO3);
		collection.add(playerDTO4);
		collection.add(playerDTO5);
		collection.add(playerDTO6);
		collection.add(playerDTO7);
		collection.add(playerDTO8);
		collection.add(playerDTO9);
		collection.add(playerDTO10);
		collection.add(playerDTO11);
		collection.add(playerDTO12);
		collection.add(playerDTO13);
		collection.add(playerDTO14);
		collection.add(playerDTO15);
		collection.add(playerDTO16);
		collection.add(playerDTO17);
		collection.add(playerDTO18);
		collection.add(playerDTO19);

		Collection<PlayerDTO> collection1 = new HashSet<PlayerDTO>();

		collection.forEach((a) -> {
			if (a.getCountry().equals("India")) {
				collection1.add(a);
			}
		});

		collection1.forEach((a) -> {
			System.out.println(a);

		});

		System.out.println("---Cricket players---");

		Collection<PlayerDTO> collection2 = new HashSet<PlayerDTO>();

		collection.forEach((a) -> {
			if (a.getPlayerSport().equals(PlayerSport.CRICKET)) {
				collection2.add(a);
			}
		});

		collection2.forEach((a) -> {
			System.out.println(a);

		});

		System.out.println("----Age above 20 less than 30----");

		Collection<PlayerDTO> collection3 = new HashSet<PlayerDTO>();

		collection.forEach((a) -> {
			if (a.getAge() > 20 && a.getAge() < 30) {
				collection3.add(a);
			}
		});

		collection3.forEach((a) -> {
			System.out.println(a);

		});

		System.out.println("----Age above 30----");

		Collection<PlayerDTO> collection4 = new HashSet<PlayerDTO>();

		collection.forEach((a) -> {
			if (a.getAge() > 30) {
				collection4.add(a);
			}
		});

		collection4.forEach((a) -> {
			System.out.println(a);

		});

		System.out.println("---Removing players above the age of 40---");

		Iterator<PlayerDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			PlayerDTO ele = iterator.next();
			if (ele.getAge() >= 40) {
				System.out.println("Players above the age of 40 " + ele.getName());
				iterator.remove();
			}
		}
		collection.forEach((a) -> {
			System.out.println(a);

		});

	}

}
