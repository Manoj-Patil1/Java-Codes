package com.codegalaxy;

public class FindIndex {
        static void findindex(int [] arr, int n){
            boolean isFound = false;
            for (int i = 0; i < arr.length; ++i){
                if (arr[i]==n){
                    isFound = true;
                    System.out.println(n+" is Found / Index = "+i);
                }
            }if (!isFound){
                System.out.println(n+" is not Found ");
            }
        }

    public static void main(String[] args) {
        int [] data = {10,20,90,44,88};
        findindex(data,44);
        findindex(data,80);
    }
    }

