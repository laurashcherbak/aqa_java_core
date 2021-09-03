package aqa.core.lesson11.KostiantynStavruk;

public class CompanyImpl extends Company {

    public CompanyImpl(String name, String adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    @Override
    void addNewEmployee(Employee employee) {
        if (employee.getSalary() == 0) {
            caclSalary(employee);
        }
        if (!checkSalary(employee)) {
            if (employee.getCategory().equals(Category.FIRST)) {
                employee.setSalary(6000);
            }
            if (employee.getCategory().equals(Category.SECOND)) {
                employee.setSalary(8000);
            }
            if (employee.getCategory().equals(Category.THIRD)) {
                employee.setSalary(13000);
            }
        }
        employees.add(employee);
    }

    @Override
    void fireEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String employeeMaxSalary() {
        Employee employeeMaxSalary = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if (employeeMaxSalary.getSalary() < employees.get(i).getSalary()) {
                employeeMaxSalary = employees.get(i);
            }
        }
        return employeeMaxSalary.getName();
    }

    @Override
    public void caclSalary(Employee employee) {
        if (employee.category.equals(Category.FIRST)) {
            employee.setSalary(6000);
        }
        if (employee.category.equals(Category.SECOND)) {
            employee.setSalary(8000);
        }
        if (employee.category.equals(Category.THIRD)) {
            employee.setSalary(13000);
        }
    }

    @Override
    public double averageSalary() {
        double sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            sum += employees.get(i).getSalary();
        }
        return sum / employees.size();
    }

    @Override
    public boolean checkSalary(Employee employee) {
        if (employee.getCategory().equals(Category.FIRST)) {
            if (employee.getSalary() < 6000) {
                System.out.println("Expected minSalary 6000 UAH, but was " + employee.getSalary() + " UAH");
                return false;
            }

        }
        if (employee.getCategory().equals(Category.SECOND)) {
            if (employee.getSalary() < 8000) {
                System.out.println("Expected minSalary 8000 UAH, but was " + employee.getSalary() + " UAH");
                return false;
            }
        }
        if (employee.getCategory().equals(Category.THIRD)) {
            if (employee.getSalary() < 13000) {
                System.out.println("Expected minSalary 13000 UAH, but was " + employee.getSalary() + " UAH");

                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return name + ": " +
                adress + ", " +
                phoneNumber +
                ", Employees:" + employees;
    }
}