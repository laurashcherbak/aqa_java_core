package aqa.core.lesson10.mykhailo_osadtsiv.company;

import java.util.ArrayList;

public class Company {
    private String name;
    private String adress;
    private int phoneNumber;
    public ArrayList<Employee> employee = new ArrayList<Employee>();

    public Company(String name, String adress, int phoneNumber, ArrayList<Employee> employee) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.employee = employee;
    }

    public Company(String name, String adress, int phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    public String getNameOfEmployeeWithHighestSallary () {
        double maxSallary = 0;
        int indexOfEmployeeWithHighestSallary = -1;

        for (int i = 0; i < employee.size(); i++) {
            if ((employee.get(i)).getSallarry() > maxSallary) {
                maxSallary = (employee.get(i)).getSallarry();
                indexOfEmployeeWithHighestSallary = i;
            }
        }
        return (employee.get(indexOfEmployeeWithHighestSallary)).getName();
    }
}
