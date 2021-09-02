package aqa.core.lesson11;

public class Employee {
    private String name;
    private String telephonenumber;
    private int salary;
    public Employee(String name, String telephonenumber, int salary) {
        this.name = name;
        this.telephonenumber = telephonenumber;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelephone() {
        return telephonenumber;
    }
    public void setTelephone(String telephonenumber) {
        this.telephonenumber = this.telephonenumber;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" + "name is" + name + ", telephone is" + telephonenumber + ", salary is" + salary + '}';
    }
}