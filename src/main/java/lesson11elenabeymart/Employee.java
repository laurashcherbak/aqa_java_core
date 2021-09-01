package lesson11elenabeymart;

public class Employee {
    private String name;
    private Integer phone;
    private Double salary;

    public Employee(String name, Integer phone, Double salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }
    //Getters and Setters of name, phone and salary go here
    public String getName() {
return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPhone() {
        return this.phone = phone;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    public Double getSalary() {
        return this.salary = salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void printInfo() {
System.out.print("Name: " + name + "Phone: " +phone+ "Salary: " +salary);
    }
}
