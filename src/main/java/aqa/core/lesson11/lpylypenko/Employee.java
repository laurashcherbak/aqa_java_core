package aqa.core.lesson11.lpylypenko;

public class Employee {
    private String name;
    private String phone;
    private int salary;

    public Employee(String name, String phone, int salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    public void printInfo() {
        System.out.print("Name: " + name + " Phone: " + phone + " Salary: " + salary);
    }
}
