package aqa.core.lesson11.heleshko;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final String phoneNumber;
    private final Integer salary;

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee(String name, String phoneNumber, Integer salary) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getSalary().compareTo(o.getSalary());
    }
}

