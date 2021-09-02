package aqa.core.lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Vinetime", "Lviv", "0677863331");
        Employee emp1 = new Employee("Maria", "0504366745", 1000);
        Employee emp2 = new Employee("Oleg", "09923477699", 800);
        Employee emp3 = new Employee("Julia", "0632145710", 750);
        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);
        System.out.println("Vinetime salaries sum = " + company.salariesSum());
        System.out.println("Vinetime average salary = " + company.salaryAverage());
        System.out.println("Vinetime top salary employee = " + company.getMaxSalary());
    }
}