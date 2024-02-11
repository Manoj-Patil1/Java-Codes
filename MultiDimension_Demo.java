package com.codegalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];

        System.out.println("Enter the Element :");
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int y = 0; y < arr.length; ++y) {
            for (int z = 0; z < arr.length; ++z) {
                System.out.println(arr[y][z]);
            }
        }
        System.out.println("Deep to String : " + Arrays.deepToString(arr));
        System.out.println("Largest Number : "+largest(arr));
    }

    public static int largest(int[][] arr) {
        int largest = arr[0][0];
        for (int[] a : arr) {
            for (int item : a)
                if (item > largest) {
                    largest = item;
                }
        }
        return largest;
    }

}
