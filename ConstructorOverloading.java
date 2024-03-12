package com.codegalaxy;

public class ConstructorOverloading {
	
	int id;
	int age;
	String name;
	
	ConstructorOverloading(int i, String n){
		id = i;
		name = n;
	}
	ConstructorOverloading(int i, int a, String n){
		id = i;
		age = a;
		name = n;
	}
	void display() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading(101,"Yash");
		co.display();
		System.out.println(" ");
		ConstructorOverloading co2 = new ConstructorOverloading(101,24,"Rohit");
		co2.display();
	}
}
