package com.codegalaxy;

import java.util.Scanner;

public class if_elseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Markks :");
			int marks = sc.nextInt();
			if(marks>70) {
				System.out.println("First class");
			}else if(marks>60 && marks<70) {
				System.out.println("Second class");
			}else if(marks>50 && marks<60) {
				System.out.println("Third class");
			}else {
				System.out.println("Failed");
			}
	}
}
