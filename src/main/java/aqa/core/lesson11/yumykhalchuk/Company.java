package main.java.aqa.core.lesson11.yumykhalchuk;
/*
@Homework 11
реалізуйте програму Компанія з використанням всіх можливостей ООП які вам вже відомі, з використанням
Абстрактних Класів та інтерфесів, з реалізацією Comparator/Comparable, використовуючи енами (edited)

Задача “Компанія”
У компанії є: назва, адреса, телефон і співробітники.
У співробітників є: ім'я, телефон, розмір зарплати.

    1. Створити метод, який знаходить ім'я співробітника з найбільшою зарплатою. Якщо таких
       декілька досить знайти хоча б одного.
    2. Створити метод, який дозволяє додати нового співробітника.
    3. Створити метод, який дозволяє звільнити співробітника з компанії.
    4. Створити метод, який обчислює розмір витрат на зарплату.
    5. Створити метод, який обчислює середню зарплату в компанії.
    6. При додаванні нового співробітника перевіряти чи не є його зарплата нижче дозволеної.
    7. * Додати можливість управління компанією через командний рядок

 */

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Company {
   private String title;
   private String companyAddress;
   private String phoneNumber;
   Employee[] employees = new Employee[8];
   private int minSalary = 2000;

   public Company(String title, String companyAddress, String phoneNumber){
       this.title = title;
       this.companyAddress = companyAddress;
       this.phoneNumber = phoneNumber;
       //this.employees = new Employee[8];

   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String employeeWithMaxSalary(){
        int maxSalary = 0;
        for (Company.Employee employee : employees){
            if (employee.getSalary() > employees[maxSalary].getSalary()){
               employees[maxSalary] = employee;
            }
        }
        return employees[maxSalary].getEmployeeName();
    }


    public void addEmployee(Employee employee){
        for(int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i]= employee;
                break;
            }
        }

    }

    public void fireEmployee(Employee employee){
        for(int i = 0; i < employees.length; i++){
            for(int j = i + 1; j < employees.length; j++){
                if (employees[i] == employees[j]){
                    employees = ArrayUtils.remove(employees, j);
                }
            }

        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "title='" + title + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }


    public static class Employee{
            private String employeeName;
            private String employeePhoneNumber;
            private double salary;


            public Employee(String employeeName, String employeePhoneNumber, double salary){
                this.employeeName = employeeName;
                this.employeePhoneNumber = employeePhoneNumber;
                this.salary = salary;
            }

            public String getEmployeeName() {
                return employeeName;
            }

            public void setEmployeeName(String employeeName) {
                this.employeeName = employeeName;
            }

            public String getEmployeePhoneNumber() {
                return employeePhoneNumber;
            }

            public void setEmployeePhoneNumber(String employeePhoneNumber) {
                this.employeePhoneNumber = employeePhoneNumber;
            }

            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

        @Override
        public String toString() {
            return "Employee{" +
                    "employeeName='" + employeeName + '\'' +
                    ", employeePhoneNumber='" + employeePhoneNumber + '\'' +
                    ", salary=" + salary +
                    '}';
        }
        }
}
