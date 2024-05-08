package com.codegalaxy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element: ");
        int number = sc.nextInt();
        if (isPalindrome(number)){
            System.out.println("Number is palindrome: "+number);
        }else {
            System.out.println("Number is not palindrome: "+number);
        }
    }

    private static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reverseNumber = 0;
        while (num > 0){
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num /= 10;
        }
        return originalNumber == reverseNumber;
    }
}
