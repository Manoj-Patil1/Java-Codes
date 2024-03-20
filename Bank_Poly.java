package com.runtyimepolymorphism;

class Bank{
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 8.3f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 9.6f;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 6.7f;
	}
}
public class Bank_Poly {
	public static void main(String[] args) {
		Bank bank;
		bank = new SBI();
		System.out.println("SBI Rate Of Interest: "+bank.getRateOfInterest());
		bank = new ICICI();
		System.out.println("ICICI Rate Of Interest: "+bank.getRateOfInterest());
		bank = new AXIS();
		System.out.println("AXIS Rate Of Interest: "+bank.getRateOfInterest());
	}

}
