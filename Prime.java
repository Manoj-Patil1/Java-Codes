package com.codegalaxy;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        boolean isFound = false;
        for (int i = 2; i < a/2; ++i){
            if (a % i == 0){
                isFound = true;
                System.out.println("Number is not prime");
            }
        }if (!isFound){
            System.out.println("Number is prime");
        }
    }
}
