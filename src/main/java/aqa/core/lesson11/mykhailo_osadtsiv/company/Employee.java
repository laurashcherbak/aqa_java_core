package aqa.core.lesson11.mykhailo_osadtsiv.company;

import java.util.Locale;
import java.util.Scanner;

public class Employee implements ComparatorForEmployee, SalaryReview {
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
            if (sallarry < 380) {
                throw new ToLowSalary(this);
            } else {
                this.sallarry = sallarry;
            }
        } catch (ToLowSalary e) {

        }
    }

    public void setSallarry() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input salary that more than 380: ");
        this.sallarry = sc.nextDouble();
    }

    @Override
    public int compareToSalary(Employee obj) {
        if (this.getSallarry() > obj.getSallarry()) return -1;
        if (this.getSallarry() < obj.getSallarry()) return 1;
        else return 0;
    }

    @Override
    public void SalaryReview() {
        Scanner sc= new Scanner(System.in);
        System.out.println("public class Test {\n" +
                "    public static void main(String[] args) {\n" +
                "        int x = 5;\n" +
                "        x = x - 10;\n" +
                "        x = (char) x;\n" +
                "        x = x + 10;\n" +
                "\n" +
                "        System.out.println(\"X = \" + x);\n" +
                "    }\n" +
                "}\n" +
                "Что напечатает программа?");
        String answer = sc.nextLine();
        if (answer.equals("X = 65541")) {
            this.setSallarry(this.getSallarry() + 150);
        } else System.out.println("Wrong answer. Try again after 3 month");
    }
}
