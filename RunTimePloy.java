package com.codegalaxy;

class A{
    void fun1(){
        System.out.println("I am class A : ");
    }
    void fun2(){
        System.out.println("I am fun 2 : ");
    }
}
class B extends A{
    void fun1(){
        System.out.println("I am class B : ");
    }
}
public class RunTimePloy {
    public static void main(String[] args) {
        A a = new B();
        a.fun1();
        a.fun2();
    }
}
