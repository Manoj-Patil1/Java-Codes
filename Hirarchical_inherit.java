package com.inheritance;

class A{
	void a() {
		System.out.println("Hiii");
	}
}
class B extends A{
	void b() {
		System.out.println("Hello");
	}
}
class C extends A{
	void c() {
		System.out.println("Hiii Hello");
	}
}
public class Hirarchical_inherit {

	public static void main(String[] args) {
		C c = new C();
		c.a();
		c.c();
	}

}
