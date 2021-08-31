package aqa.core.lesson11.lpylypenko;

public class Company{
    private String address;
    private String phone;
    private static final double MIN_SALARY   = 1000; // for example min salary is 1000 dollars per month

    private Employee[] employees;

    public Company(String adress, String phone) {
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
            resultArr[employees.length + 1] = emp;
            System.arraycopy(employees, 0, resultArr, 0, employees.length);
            this.employees = resultArr;
        }
        else
        {
            System.out.println("Impossible to add employee with salary less than " + MIN_SALARY);
        }
    }

    public void removeEmployee(Employee emp)
    {
        int index = this.getEmployeeIndex(emp);
        if (index != -1)
        {
            System.arraycopy(employees, index + 1, employees, index, employees.length - index - 1);
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

    public long getTSumOfAllSalaries()
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

    private int getEmployeeIndex(Employee emp) {
        int index = -1;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(emp.getName()))
                index = i;
        }

        if (index == -1)
        {
            System.out.println("Employee not found in the company!");
            return -1;
        }
        return index;
    }
}