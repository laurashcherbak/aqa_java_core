package aqa.core.lesson11.heleshko;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Juja", "12345", 33500);
        Employee employee2 = new Employee("Dora", "12367", 416500);
        Employee employee3 = new Employee("Mykhtar", "12325", 12000);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Company company = new Company("GlobalLogic", "Horodozka", "12334", employeeList);
        System.out.println(company.getNameOfEmployeeWithTheBiggestSalary());

        company.addEmployee("Ira", "34445", 33300, 100000);
        System.out.println("Number of employees: " + company.getEmployees().size());

        company.deleteEmployee("Juja");
        System.out.println("Number of employees: " + company.getEmployees().size());

        System.out.println("Overall sum of salary: " + company.calculateOverallSalary());

        System.out.println("Average salary: " + company.calculateAverageSalary());

        company.addEmployee("Ira", "34445", 333300, 100000);
    }
}
