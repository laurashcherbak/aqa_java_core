package aqa.core.lesson11.lpylypenko;
import java.util.Arrays;

public class Company{
    private String address;
    private String phone;
    private static final double MIN_SALARY   = 1000; // for example min salary is 1000 dollars per month

    private Employee[] employees;

    public Company(String address, String phone) {
        this.address = address;
        this.phone = phone;
        this.employees = new Employee[] { };
    }

    public Company(String adress, String phone, Employee[] employees) {
        this.address = address;
        this.phone = phone;
        this.employees = employees;
    }

    public void addEmployee(Employee emp)
    {
        if (emp.getSalary() >= MIN_SALARY)
        {
            Employee[] resultArr = new Employee[employees.length + 1];
            resultArr[employees.length] = emp;
            System.arraycopy(employees, 0, resultArr, 0, employees.length);
            this.employees = resultArr;
            System.out.println(emp.getName() + " employee was added to the company!");
        }
        else
        {
            System.out.println("Impossible to add employee with salary less than " + MIN_SALARY);
        }
    }

    public void removeEmployee(String employeeName)
    {
        int index = this.getEmployeeIndex(employeeName);
        if (index != -1)
        {
            Employee[] resultArr = new Employee[employees.length - 1 ];
            System.arraycopy(employees, 0, resultArr, 0, index);
            System.arraycopy(employees, index + 1, resultArr, index, resultArr.length - index);
            this.employees  = resultArr;
            System.out.println(employeeName + " employee was removed from the company!");
        }
    }

    public String getEmployeeNameWithMaxSalary()
    {
        Employee resultEmp = null;
        int maxSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary)
            {
                maxSalary = employees[i].getSalary();
                resultEmp = employees[i];
            }
        }

        if (resultEmp == null)  return null;

        return resultEmp.getName();
    }

    public long getSumOfAllSalaries()
    {
        long sum = 0;

        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public float getAverageSalary() {
        float sum = 0f;
        for (Employee emp : employees)
        {
            sum = sum + emp.getSalary();
        }
        return sum / employees.length;
    }

    public void printEmployees() {
        for (Employee emp : employees)
        {
            System.out.println(emp.toString());
        }
    }

    private int getEmployeeIndex(String employeeName) {
        int index = -1;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(employeeName))
                index = i;
        }

        if (index == -1)
        {
            System.out.println("Employee not found in the company!");
            return -1;
        }
        return index;
    }

    @Override
    public String toString() {
        return "Address: " + address + " Phone: " + phone;
    }
}