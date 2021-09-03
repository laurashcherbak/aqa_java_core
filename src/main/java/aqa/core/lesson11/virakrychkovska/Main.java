package aqa.core.lesson11.virakrychkovska;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Autumn", "Lviv", "0678062568");
        Employee emp1 = new Employee("Oleh", "0679087878", 1000);
        Employee emp2 = new Employee("Katya", "0686768678", 2000);
        Employee emp3 = new Employee("Ivan", "0935678543", 1400);
        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);
        System.out.println("Autumn salaries sum = " + company.salariesSum());
        System.out.println("Autumn top salary employee = " + company.getMaxSalary());
        System.out.println("Autumn average salary = " + company.salaryAverage());
    }
}
