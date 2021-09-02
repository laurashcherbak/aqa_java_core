package aqa.core.lesson11.sikyrynska;

import java.util.Arrays;

public class Company {
    public String name;
    public String  address;
    public String telNum;
    public Employee[] empl;

    private static int minimumSalary = 100;

    public Company(String name, String address, String telephoneNum) {
        this.name = name;
        this.address = address;
        this.telNum = telephoneNum;
        this.empl = new Employee[20];
    }

    private boolean isEmployeeListEmpty(){
        int notNullCount = 0;
        for (int i = 0; i < empl.length; i++){
            if(empl[i] != null){
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
        for (int i=0; i<empl.length; i++){
            if (empl[i] != null && empl[maxSalaryIndex].getSalary() < empl[i].getSalary()){
                maxSalaryIndex = i;
            }
        }
        return empl[maxSalaryIndex].getName();
    }

    public void addEmployee(Employee employee){
        if(employee.getSalary() < minimumSalary) {
            //throw new SalaryIsNotAllowed();
        }
        for(int j=0; j<empl.length; j++){
            if (empl[j]==null){
                empl[j]= employee;
                break;
            }
        }
    }

    public void dismissEmployee(Employee employee){
        for(int i=0; i<empl.length; i++){
            if (employee.equals(empl[i])){
                empl[i]= null;
                break;
            }
        }
    }

    public int salariesSum(){
        int sumSalary = 0;
        for (int l=0; l<empl.length; l++){
            if (empl[l] != null){
                sumSalary += empl[l].getSalary();
            }
        }
        return sumSalary;
    }

    public double salaryAverage(){
        int sumSalary = 0;
        int counter=0;
        for (int m=0; m<empl.length; m++){
            if (empl[m] != null) {
                sumSalary += empl[m].getSalary();
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
        return telNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telNum = telephoneNum;
    }

    public Employee[] getEmployees() {
        return empl;
    }

    public void setEmployees(Employee[] empl) {
        this.empl = empl;
    }

    @Override
    public String toString() {
        return "Company{" + "name='" + name + '\'' + ", address='" + address + '\'' +
                ", telephoneNum='" + telNum + '\'' + ", employees=" + Arrays.toString(empl) + '}';
    }
}