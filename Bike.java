package com.finalvar;

class Honda{
	final void run() {
		System.out.println("Running");
	}
}
public class Bike extends Honda {
	void jump() {
		System.out.println("Jumping");
	}
	public static void main(String[] args) {
	Bike bike = new Bike();
	bike.run();
	bike.jump();
}

}
