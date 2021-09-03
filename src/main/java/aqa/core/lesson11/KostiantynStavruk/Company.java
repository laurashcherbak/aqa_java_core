package aqa.core.lesson11.KostiantynStavruk;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {
    String name;
    String adress;
    String phoneNumber;
    List<Employee> employees = new ArrayList<>();

    abstract void addNewEmployee(Employee employee);

    abstract void fireEmployee(Employee employee);

    abstract String employeeMaxSalary();

    abstract void caclSalary(Employee employee);

    abstract double averageSalary();

    public abstract boolean checkSalary(Employee employee);
}

