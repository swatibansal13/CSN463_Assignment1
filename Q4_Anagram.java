package assignment1;

import java.util.HashMap;
import java.util.Map;
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

		Map<Character,Integer> alphaStr1 = new HashMap();
		for(char c: str1.toCharArray()){
			if(alphaStr1.containsKey(c)){
				alphaStr1.replace(c, alphaStr1.get(c), alphaStr1.get(c) + 1);
			}
			else{
				alphaStr1.put(c, 1);
			}
		}

		Map<Character,Integer> alphaStr2 = new HashMap();
		for(char c: str2.toCharArray()){
			if(alphaStr2.containsKey(c)){
				alphaStr2.replace(c, alphaStr2.get(c), alphaStr2.get(c) + 1);
			}
			else{
				alphaStr2.put(c, 1);
			}
		}

		return alphaStr1.equals(alphaStr2);
	}

}
