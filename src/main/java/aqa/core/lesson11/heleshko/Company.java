package aqa.core.lesson11.heleshko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public Company(String name, String address, String phoneNumber, List<Employee> employees) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.employees = employees;
    }

    public String getNameOfEmployeeWithTheBiggestSalary() {
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);

        employees.sort(compareBySalary.reversed());
        return employees.get(0).getName();
    }

    public void addEmployee(String name, String phoneNumber, Integer salary, Integer allowableSalary) {
        if (salary > allowableSalary) {
            System.out.println("Can't add an employee, his salary is too big.");
        } else {
            Employee employee = new Employee(name, phoneNumber, salary);
            employees.add(employee);
        }
    }

    public void deleteEmployee(String name) {
        Employee employee = employees.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst().orElse(null);
        if (employee != null) {
            employees.remove(employee);
        } else {
            System.out.println("No employee with such a name.");
        }
    }

    public Integer calculateOverallSalary() {
        int sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        return sum;
    }

    public double calculateAverageSalary() {
        int sum = 0;

        ArrayList<Integer> salaryList = new ArrayList<>();
        for (Employee employee : employees) {
            salaryList.add(employee.getSalary());
        }

        for (Integer integer : salaryList) {
            sum += integer;
        }

        return sum * 1.0 / salaryList.size();
    }
}
