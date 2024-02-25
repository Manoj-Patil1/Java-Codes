package com.codegalaxy;

import java.util.Scanner;

public class StudentInfo {
     int id;
     String name;
     double fees;
     Scanner sc = new Scanner(System.in);
     void setStudent(){
         System.out.println("Enter the id : ");
         id = sc.nextInt();
         System.out.println("Enter the name : ");
         name = sc.next();
         System.out.println("Enter the fees : ");
         fees = sc.nextDouble();
     }
     void getStudent(){
         System.out.println("ID : "+id);
         System.out.println("Name : "+name);
         System.out.println("Fees : "+fees);
     }

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.setStudent();
        s1.getStudent();

        StudentInfo s2 = new StudentInfo();
        s2.setStudent();
        s2.getStudent();
    }
}
