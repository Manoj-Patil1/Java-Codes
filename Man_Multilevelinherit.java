package com.runtyimepolymorphism;

class G{
	void eat() {
		System.out.println("eating vegetables... ");
	}
}
class H extends G{
	void eat() {
		System.out.println("eating fruits...");
	}
}
public class Man_Multilevelinherit extends H{
	void eat() {
		System.out.println("eating meat...");
	}
	public static void main(String[] args) {
		G g1,g2,g3;
		g1 = new G();
		g2 = new H();
		g3 = new Man_Multilevelinherit();
		g1.eat();
		g2.eat();
		g3.eat();
	}

}
