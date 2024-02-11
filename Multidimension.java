package com.codegalaxy;

import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the Element :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int y = 0 ; y < arr.length ; y++){
            for (int z = 0; z < arr[y].length; z++){
                System.out.print(arr[y][z]+" ");
            }
            System.out.println();
        }
    }
}
