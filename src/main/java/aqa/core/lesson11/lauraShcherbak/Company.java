package aqa.core.lesson11.lauraShcherbak;

public class Company implements Calculation {
    private String name;
    private String address;
    private String phone;
    private Person[] employees;
    private final double minSalary = 10000.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    public String getEmployeeWithMaxSalary(String name) {
        double salary = employees[0].getSalary();
        int t = 0;
        for (int j = 1; j < employees.length - 1; j++) {
            if (employees[j].getSalary() > salary) {
                t = j;
            }
        }
        return employees[t].getName();
    }

    public void addEmployee(Person emp) {
        if (emp.getSalary() >= minSalary) {
            Person[] t = new Person[employees.length + 1];
            for (int j = 0; j < employees.length - 1; j++) {
                t[j] = employees[j];
            }
            t[employees.length] = emp;
            setEmployees(t);
        }
    }

    public void removeEmployee(Person emp) {
        int i = 0;
        Person[] t = new Person[employees.length - 1];
        for (int j = 0; j < employees.length - 1; j++) {
            if (!employees[j].getName().equals(emp.getName())) {
                t[i++] = employees[j];
            }
        }
        t[employees.length] = emp;
        setEmployees(t);
    }

    public double getSumSalaries()
    {
        double sum = 0;

        for (Person x : employees) {
            sum += x.getSalary();
        }
        return sum;
    }

    @Override
    public double getAverageSalary() {
        double sum = 0;
        for (Person x : employees)
        {
            sum += x.getSalary();
        }
        return sum / employees.length;
    }

}
