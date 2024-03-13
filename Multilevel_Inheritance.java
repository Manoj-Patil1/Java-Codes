package com.codegalaxy;
class HR{
    public int getEmpno() {
        return 111;
    }
    public int getSalary() {
        return 80000;
    }
    public String getJob() {
        return "Software Developer";
    }
}
class Admin extends HR{
    public String getWorkStation() {
        return "Mumbai";
    }
}
class Employee extends Admin{
    public String getName() {
        return "Radhe";
    }
}

public class Multilevel_Inheritance{
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Emp No : "+emp.getEmpno());
        int sal = emp.getSalary();
        System.out.println("Emp Salary : "+sal);
        System.out.println("Emp Job : "+emp.getJob());
        System.out.println("Emp WorkStation : "+emp.getWorkStation());
        System.out.println("Emp Name : "+emp.getName());
        double bonus = sal*0.15;
        System.out.println("Bonus : "+bonus);

    }

}
