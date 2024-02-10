package com.codegalaxy;

public class Constructor {
	
//	[ Object Data type :- Class name ]
	
	int id;
	String name;
	
//	Default Constructor :
	public Constructor() {
		System.out.println("Default Construactor : ");
		id = 10;
		name = "Rohit";
	}

	
//	Parameterized Constructor :
	
	public Constructor(int x,String y) {
		System.out.println("Parameterized Constructor : ");
		id = x;
		name = y;
	}
	
//	Copy Constructor :
	
	Constructor(Constructor c2) {
		System.out.println("Copy Constructor : ");
		id = c2.id;
		name = c2.name;
	}
	
	void display() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c1 = new Constructor();
		c1.display();
		
		Constructor c2 = new Constructor(11,"Yash");
		c2.display();

		Constructor c3 = new Constructor(c2);
		c3.display();
		
	}

}
