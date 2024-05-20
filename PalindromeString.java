package com.string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
//		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.next();
		if (isPalindrome(str)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
//		Using StringBuilder
//		String reverse = new StringBuilder(str).reverse().toString();
//		if(str.equals(reverse)) {
//			System.out.println("String is palindrome");
//		}else {
//			System.out.println("String is not palindrome");
//		}
	}

	private static boolean isPalindrome(String string) {
		int originalString=0;
		int reverseString = string.length()-1;
		while(string.charAt(originalString)!=string.charAt(reverseString)) {
			return false;
		}
		
		originalString++;
		reverseString--;
		return originalString == reverseString;
	}

}
