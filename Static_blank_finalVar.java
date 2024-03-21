package com.finalvar;

public class Static_blank_finalVar {
	static final int data;
	static {data = 25;}
	static final String name;
	static {name = "Vivek";}

	public static void main(String[] args) {
		System.out.println("Name: "+Static_blank_finalVar.name);
		System.out.println("Age: "+Static_blank_finalVar.data);
	

	}

}
