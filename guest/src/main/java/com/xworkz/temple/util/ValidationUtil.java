package com.xworkz.temple.util;

public class ValidationUtil {

	public static boolean validateString(String string) {
		if (string != null && !string.isEmpty() && string.length() >= 3 && string.length() < 30) {
			System.out.println("Valid data entered");
			return true;
		}
		System.err.println("Invalid data entered");
		return false;

	}

	public static boolean validateInt(int number) {
		if (number > 0 && number < 10000) {
			System.out.println("Valid number entered ");
			return true;
		}

		System.err.println("Invalid data entered");
		return false;
	}

}
