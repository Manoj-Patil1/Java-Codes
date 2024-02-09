package com.codegalaxy;

import java.util.Arrays;

public class Reversearr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1 - i; j >= 0; j--) {
                arr2[j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));

        //Second Approach
        
//        int start=0;
//        int end= arr.length-1;
//        while(start<=end){
//            getReverse(arr,start,end);
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void getReverse(int[] arr,int start,int end){
//        int temp=arr[start];
//        arr[start]=arr[end];
//        arr[end]=temp;
//    }
    }
}
