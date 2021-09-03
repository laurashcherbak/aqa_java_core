package aqa.core.lesson11;

import java.util.Arrays;

public class Company {
    public String name;
    public String address;
    public String telNum;
    public Employee[] e;

    private static int minimumSalary = 100;

    public Company(String name, String address, String telephoneNum) {
        this.name = name;
        this.address = address;
        this.telNum = telephoneNum;
        this.e = new Employee[20];
    }

    private boolean isEmployeeListEmpty() {
        int notNullCount = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                notNullCount++;
            }
        }
        return notNullCount == 0;
    }

    public String getMaxSalaryEmployee() {
        if (isEmployeeListEmpty()) {
            return null;
        }
        int maxSalaryIndex = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null && e[maxSalaryIndex].getSalary() < e[i].getSalary()) {
                maxSalaryIndex = i;
            }
        }
        return e[maxSalaryIndex].getName();
    }

    public void addEmployee(Employee employee) {
        if (employee.getSalary() < minimumSalary) {
            //throw new SalaryIsNotAllowed();
        }
        for (int j = 0; j < e.length; j++) {
            if (e[j] == null) {
                e[j] = employee;
                break;
            }
        }
    }

    public void dismissEmployee(Employee employee) {
        for (int i = 0; i < e.length; i++) {
            if (employee.equals(e[i])) {
                e[i] = null;
                break;
            }
        }
    }

    public int salariesSum() {
        int sumSalary = 0;
        for (int l = 0; l < e.length; l++) {
            if (e[l] != null) {
                sumSalary += e[l].getSalary();
            }
        }
        return sumSalary;
    }

    public double salaryAverage() {
        int sumSalary = 0;
        int counter = 0;
        for (int m = 0; m < e.length; m++) {
            if (e[m] != null) {
                sumSalary += e[m].getSalary();
                counter++;
            }
        }
        return sumSalary / counter;
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
        return telNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telNum = telephoneNum;
    }

    public Employee[] getEmployees() {
        return e;
    }

    public void setEmployees(Employee[] e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Company{" + "name='" + name + '\'' + ", address='" + address + '\'' +
                ", telephoneNum='" + telNum + '\'' + ", employees=" + Arrays.toString(e) + '}';
    }
}
