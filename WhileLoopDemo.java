package com.codegalaxy;

import java.awt.image.ComponentSampleModel;
import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");

        int i;
        int sum = 0;
        i = sc.nextInt();
        while (i<=10){
            System.out.println(i);
            sum+=i;
            ++i;
        }
        System.out.println("Sum of the Number :"+sum);
    }
}
