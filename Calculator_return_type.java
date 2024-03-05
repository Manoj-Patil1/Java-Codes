package com.java7M;

public class Calculator_return_type {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
    public int multi(int num1,int num2){
        return num1*num2;
    }
    public int div(int num1,int num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        Calculator_return_type cal = new Calculator_return_type();
        System.out.println("Addition : "+cal.add(10,10));
        System.out.println("Subtraction : "+cal.sub(100,50));
        System.out.println("Multiplication : "+cal.multi(50,2));
        System.out.println("Division : "+cal.div(100,5));

    }
}
