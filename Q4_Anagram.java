package assignment1;

import java.util.Scanner;

public class Q4_Anagram {

	public static void main(String[] args) {
		
		//Check if two strings/numbers are anagrams of each other.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st String: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter 2nd String: ");
		String str2 = sc.nextLine();

		try {
			System.out.println("Are they Anagrams => "+isAnagram(str1, str2));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean isAnagram(String str1, String str2) throws Exception {
		if (str1.length() != str2.length())
			return false;
				
		// String should contain only alphabets
		if ((!str1.matches("^[a-zA-Z]+") && !str2.matches("^[a-zA-Z]+")))
			throw new Exception("String should contain only alphabets !");

		int sum1 = 0;
		for (int i = 0; i < str1.length(); i++) {
			sum1 = sum1 + (int) str1.charAt(i);
		}

		int sum2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			sum2 = sum2 + (int) str2.charAt(i);
		}

		return sum1 == sum2;
	}

}
