package assignment1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Q5_ConvertToUpperCase {

	public static void main(String[] args) {

		// Write a program using java to convert first letter of each word into upper case letter.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();

		try {
			System.out.println(firstCharToUpperCase(str));
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}

	}

	public static String firstCharToUpperCase(String str) throws Exception {
		if ((!(str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))) {
			throw new Exception("Illegal Character. First letter should be an Alphabet!");
		}
		return Character.toUpperCase(str.charAt(0)) + str.substring(1);
	}

}
