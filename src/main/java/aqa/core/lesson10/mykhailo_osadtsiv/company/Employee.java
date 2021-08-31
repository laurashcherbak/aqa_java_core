package aqa.core.lesson10.mykhailo_osadtsiv.company;

public class Employee {
    private String name;
    private int phoneNumber;
    private double sallarry;

    public Employee(String name, int phoneNumber, double sallarry) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.sallarry = sallarry;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSallarry() {
        return sallarry;
    }

    public void setSallarry(double sallarry) {
        this.sallarry = sallarry;
    }
}
