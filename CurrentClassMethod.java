package com.thiskeyword;

class A{
    void m(){
        System.out.println("Hello Angelica...");
    }
    void n(){
        System.out.println("Hello Jack...");
        this.m();
    }
}
public class CurrentClassMethod {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}
