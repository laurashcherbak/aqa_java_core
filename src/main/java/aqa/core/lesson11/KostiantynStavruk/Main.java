package aqa.core.lesson11.KostiantynStavruk;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kostya", "0971704001", Category.THIRD);
        Employee emp2 = new Employee("Julia", "0971704001", 4000, Category.SECOND);
        Employee emp3 = new Employee("John", "0971704001", 5900, Category.FIRST);
        Company globalLogic = new CompanyImpl("Global Logic", "Saharova Srteet", "+43487984");
        globalLogic.addNewEmployee(emp1);
        globalLogic.addNewEmployee(emp2);
        globalLogic.addNewEmployee(emp3);
        System.out.println(globalLogic.employeeMaxSalary());
        System.out.println(globalLogic.averageSalary());
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println("================================================================================================");
        System.out.println(globalLogic);
        System.out.println("Fire John");
        globalLogic.fireEmployee(emp3);
        System.out.println("================================================================================================");
        System.out.println(globalLogic);
    }

}
