package main.java.aqa.core.lesson11.virakrychkovska;

public class Employee {
    private String name;
    private String telephone;
    private int salary;
    public Employee(String name, String telephone, int salary) {
        this.name = name;
        this.telephone = telephone;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name is" + name +
                ", telephone is" + telephone +
                ", salary is" + salary +
                '}';
    }
}
