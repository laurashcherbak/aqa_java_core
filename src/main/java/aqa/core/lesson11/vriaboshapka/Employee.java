package aqa.core.lesson11.vriaboshapka;

public class Employee {
    String name;
    int phone;
    int salary;

    public Employee(String name,int phone, int salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPhone(){
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

