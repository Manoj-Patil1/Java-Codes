package com.codegalaxy;
import java.util.Scanner;
public class Employeedetail {
	
	private int empno;
	private double salary;
	private String station;

	public Employeedetail(int empno,double salary) {
		this.empno = empno;
		this.salary = salary;
	}
	public void display() {
		System.out.println("Employee No : "+empno);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee WorkStation : "+station);
	}
	public void setStation(String station) {
		this.station = station;
	}
	public double bonus() {
		double bonus = 0.15;
		return salary*bonus;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee No : ");
		int empno = sc.nextInt();
		System.out.println("Enter the Employee Salary : ");
		double salary = sc.nextDouble();
		System.out.println("Enter the Employee WorkStation : ");
		String station = sc.next();
		Employeedetail emp = new Employeedetail(empno,salary);
		System.out.println("Employee Detail - ");
		emp.setStation(station);
		emp.display();
		double bonus = emp.bonus();
		System.out.println("Employee Bonus : "+bonus);
	}
}
