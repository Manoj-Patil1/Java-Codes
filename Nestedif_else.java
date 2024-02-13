package com.codegalaxy;

import java.util.Scanner;

public class Nestedif_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		if(num>1) { 
			if(num%2==0) {
				System.out.println("Number is Even");
			}else {
				System.out.println("Number is Odd");
			}
	}else {
		   System.out.println("Invalid Number");
	   }
	}
}
