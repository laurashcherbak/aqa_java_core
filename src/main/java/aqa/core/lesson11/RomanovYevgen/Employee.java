package aqa.core.lesson11.RomanovYevgen;

import java.util.Locale;
import java.util.Scanner;

public class Employee extends Comparator {
    private String name;
    private String phoneNumber;
    private double sallarry;

    public Employee(String name, String phoneNumber, double sallarry) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.sallarry = sallarry;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", sallarry=" + sallarry +
               '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSallarry() {
        return sallarry;
    }

    public void setSallarry(double sallarry) {
        try {
            if (sallarry < 450) {
                throw new ToLowSallarry(this);
            } else {
                this.sallarry = sallarry;
            }
        } catch (ToLowSallarry e) {

        }
    }

    public void setSallarry() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input sallarrynot more than 450:");
        this.sallarry = sc.nextDouble();
    }

    @Override
    public int compareToSalary(Employee obj) {
        int result;
        if (this.getSallarry() > obj.getSallarry()) {
            result = -1;
        } else if (this.getSallarry() < obj.getSallarry()) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
