package com.codegalaxy;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        System.out.println("***Calculator***");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Calculator c1 = new Calculator();
        c1.cal();
    }
    void cal(){
        Scanner sc = new Scanner(System.in);
        int a, b, opr, c = 0;
        System.out.println("Enter the first Number : ");
        a = sc.nextInt();
        System.out.println("Enter the second Number : ");
        b = sc.nextInt();
        System.out.println("Enter the Operation Number : ");
        opr = sc.nextInt();
        switch (opr){
            case 1 -> {
                c = a+b;
                System.out.println("/Addition : "+c);
            }
            case 2 -> {
                c = a - b;
                System.out.println("/Subtraction : " + c);
            }
            case 3 -> {
                c = a * b;
                System.out.println("/Multiplication : " + c);
            }
            case 4 -> {
                c = a / b;
                System.out.println("/Division : " + c);
            }
            default -> System.out.println("/Invalid Operation Number : "+c);

        }
    }
}
