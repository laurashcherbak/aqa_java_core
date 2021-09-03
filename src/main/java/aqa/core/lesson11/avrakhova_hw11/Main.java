package aqa.core.lesson11.avrakhova_hw11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("NovaPoshta", "Lviv", "937979992");
        Employee e1 = new Employee("Ivan", "12345", 256);
        Employee e2 = new Employee("Vasyl", "34566", 180);
        Employee e3 = new Employee("Petro", "45678", 251);
        Employee e4 = new Employee("Pavlo", "57683", 305);
        Employee e5 = new Employee("Bohdan", "46834", 592);
        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);
        company.addEmployee(e4);
        company.addEmployee(e5);
        System.out.println("NovaPoshta salaries sum = " + company.salariesSum());
        System.out.println("NovaPoshta top salary employee = " + company.getMaxSalaryEmployee());
        System.out.println("NovaPoshta average salary = " + company.salaryAverage());
        company.dismissEmployee(e5);
        System.out.println("NovaPoshta top salary employee = " + company.getMaxSalaryEmployee());



    }

}
