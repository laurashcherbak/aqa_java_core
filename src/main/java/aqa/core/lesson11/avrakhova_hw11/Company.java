package aqa.core.lesson11.avrakhova_hw11;

import java.util.Arrays;

public class Company {
    private String name;
    private String address;
    private String telephoneNum;
    private Employee[] employees;

    private static int minimumSalary = 100;

    public Company(String name, String address, String telephoneNum) {
        this.name = name;
        this.address = address;
        this.telephoneNum = telephoneNum;
        this.employees = new Employee[20];
    }

    private boolean isEmployeeListEmpty(){
        int notNullCount = 0;
        for (int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                notNullCount++;
            }
        }
        return notNullCount == 0;
    }

    public String getMaxSalaryEmployee(){
        if (isEmployeeListEmpty()) {
            return null;
        }
        int maxSalaryIndex = 0;
        for (int i=0; i<employees.length; i++){
            if (employees[i] != null && employees[maxSalaryIndex].getSalary() < employees[i].getSalary()){
                maxSalaryIndex = i;
            }
        }
        return employees[maxSalaryIndex].getName();
    }

    public void addEmployee(Employee employee){
        if(employee.getSalary() < minimumSalary) {
            throw new SalaryIsNotAllowedException();
        }
        for(int i=0; i<employees.length; i++){
            if (employees[i]==null){
                employees[i]= employee;
                break;
            }
        }
    }

    public void dismissEmployee(Employee employee){
        for(int i=0; i<employees.length; i++){
            if (employee.equals(employees[i])){
                employees[i]= null;
                break;
            }
        }
    }

    public int salariesSum(){
        int sumSalary = 0;
        for (int i=0; i<employees.length; i++){
            if (employees[i] != null){
                sumSalary += employees[i].getSalary();
            }
        }
        return sumSalary;
    }

    public double salaryAverage(){
        int sumSalary = 0;
        int counter=0;
        for (int i=0; i<employees.length; i++){
            if (employees[i] != null) {
                sumSalary += employees[i].getSalary();
                counter++;
            }
        }
        return sumSalary/counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNum='" + telephoneNum + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
