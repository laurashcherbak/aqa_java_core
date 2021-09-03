package aqa.core.lesson11.KostiantynStavruk;

public class Employee {
    String name;
    String phoneNumber;
    double salary;
    Category category;

    public Employee(String name, String phoneNumber, double salary, Category category) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.category = category;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name + ", " +
                phoneNumber + ", " +
                salary + " UAH, " +
                category + " category";
    }

    public Employee(String name, String phoneNumber, Category category) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.category = category;
    }

}
