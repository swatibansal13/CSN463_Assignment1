package assignment1;

import java.util.Scanner; 

public class Q2_ParagraphParsing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Paragraph: ");
		String para = sc.nextLine();
		
		System.out.println("Enter a string to want to replace: ");
		String replace = sc.nextLine();
		
		System.out.println(replace(para,replace));

	}
	
	public static String replace(String s, String pattern) {
				
		String code = Character.toUpperCase(pattern.charAt(0)) + "";
		for(int i=0;i<pattern.length()-1;i++) {
			code = code + '*' ;
		}

		String ans = s.replace(pattern,code);

		return ans;
	}
	
	

}
