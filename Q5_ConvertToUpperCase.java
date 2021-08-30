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
		String words[] = str.split(" ");
		String ans = "";

		for(String word : words){
			if (((word.charAt(0) <= 'a' && word.charAt(0) >= 'z') || (word.charAt(0) <= 'A' && word.charAt(0) >= 'Z'))) {
				throw new Exception("Illegal Character. First letter should be an Alphabet!");
			}
			ans = ans + Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}

		return ans;
	}

}
