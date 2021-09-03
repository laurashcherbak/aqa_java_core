package aqa.core.nSkrypak;

public class Employees {
    String employeesName;
    int employeesPhone;
    double salary;

    public String getEmployeesName() { return employeesName; }
    public int getEmployeesPhone() { return employeesPhone; }
    public double getSalary() { return salary; }

    public void setEmployeesName(String employeesName) {this.employeesName = employeesName;}
    public void setEmployeesPhone(int employeesPhone) {this.employeesPhone = employeesPhone;}
    public void setSalary(double salary) {this.salary = salary;}

    public Employees(String employeesName, int employeesPhone, double salary) {
        this.employeesName = employeesName;
        this.employeesPhone = employeesPhone;
        this.salary = salary;
    }


}
