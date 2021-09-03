package aqa.core.lesson11;

public class Main {
    public static void main(String[] args) {
        Company comp = new Company("GL", "Lviv", "0686883949");
        Employee e1 = new Employee("Pavlo", "0938569955", 15000);
        comp.addEmployee(e1);
        Employee e2 = new Employee("Valentyna", "0678855134", 22000);
        comp.addEmployee(e2);
        Employee e3 = new Employee("Katya", "0997683333", 12000);
        comp.addEmployee(e3);
        System.out.println("Salaries sum = " + comp.salariesSum());
        System.out.println("Average salary = " + comp.salaryAverage());
        System.out.println("Top salary has: " + comp.getMaxSalaryEmployee());
    }
}
