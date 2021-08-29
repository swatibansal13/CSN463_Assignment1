package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_CountOfSubString {

	//check for only characters A-Z or a-z
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the subString whose occurrences you want to find: ");
		String subString = sc.nextLine();
		
		System.out.println("Occurences: "+countOccurences(str, subString));

	}
	
	public static int countOccurences(String str, String pattern) {
		int count = 0;
		int strLength = str.length();
	
		char[] substring = pattern.toCharArray();
		Arrays.sort(substring);
		
		String substr = new String(substring);
		int subStrLength = substr.length();
		
		for(int i=0; i < strLength-subStrLength; i++) {
			
			String temp = str.substring(i,i+subStrLength);
			char[] tempArr = temp.toCharArray();
			Arrays.sort(tempArr);
			String tempStr = new String(tempArr);
			
			if(tempStr.equals(substr)) {
				count++;
				i++;
			}
		
		}
		
		return count;
	}

}
