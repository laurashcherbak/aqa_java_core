package aqa.core.lesson11.sikyrynska;

public class Main {
    public static void main(String[] args) {
        Company comp = new Company("NovaPoshta", "Lviv", "937979992");
        Employee empl1 = new Employee("Ira", "0678965123", 10000);
        comp.addEmployee(empl1);
        Employee empl2 = new Employee("Katia", "0934526425", 12000);
        comp.addEmployee(empl2);
        Employee empl3 = new Employee("Yura", "0687852463", 9000);
        comp.addEmployee(empl3);
        System.out.println("Glovo salaries sum = " + comp.salariesSum());
        System.out.println("Glovo average salary = " + comp.salaryAverage());
        System.out.println("Glovo top salary has: " + comp.getMaxSalaryEmployee());
    }
}
