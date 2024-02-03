package com.codegalaxy;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double facto = 1;
        System.out.println("Enter the number : ");
        double a = sc.nextInt();
        for (double i = 1; i <= a; ++i){
            facto = facto*i;
        }
        System.out.println(facto);
    }
}
