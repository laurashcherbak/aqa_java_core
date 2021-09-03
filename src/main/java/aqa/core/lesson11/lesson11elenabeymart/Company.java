package aqa.core.lesson11.lesson11elenabeymart;

public class Company {
    private String name;
    private String address;
    private String phone;
    private static double min_Salary = 1000;
private Employee[] employees;
    int length;
    public Company(String name, String address,String phone, Double salary, Employee[] employees) {
    this.name = name;
    this.address = address;
    this.phone = phone;
   this.min_Salary = salary;
    this.employees = employees;
}
    public Company(String name, String phone, Double salary) {
    }
    public String getMax_salary() {
        double maxSalary = 0;
        String name = "";
        int i;
        for (i = 0; i < employees.length; i++) ;
        if (employees[i].getSalary() >= maxSalary) {
            maxSalary = employees[i].getSalary();
            name = employees[i].getName();
        }
        return name;
    }
    public void addEmployee(Employee employees) throws Exception {
    if(min_Salary > employees.getSalary()) {
        throw new Exception("Salary is less than minimum");
    }
    Employee[] resultArr = new Employee[employees.length + 1];
    resultArr[employees.length + 1] = employees;
    System.arraycopy(employees, 0, resultArr, 0, employees.length);
     this.employees = resultArr;
    }
    public void getFired(Employee employees) {
        int index = this.getEmployeeIndex(employees);
        if (index != -1) {
            System.arraycopy(employees, index + 1, employees, index, employees.length - index -1);
        }
    }
    public int getEmployeeWithMaxSalary() {
        int EmployeeWithMaxSalary = 0;
        for (int i= 0; i<employees.length; i++){
            EmployeeWithMaxSalary+= employees[i].getSalary();
        }
        return EmployeeWithMaxSalary;
    }
    public int AvgSalary() {
        return getEmployeeWithMaxSalary()/ employees.length;
    }

    private int getEmployeeIndex(Employee employees) {
        return getEmployeeIndex(employees);
    }
}

