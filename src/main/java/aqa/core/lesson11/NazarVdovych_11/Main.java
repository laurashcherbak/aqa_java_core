package aqa.core.lesson11.NazarVdovych_11;

public class Main {


   public static void main(String[] args) {
        Company company = new Company("Nazar", "Lviv", "5676868");


       Employee e1 = new Employee("RonVisli", "93943924234", 6556);
       Employee e2 = new Employee("GermionaGreynd", "23423534", 3480);
       Employee e3 = new Employee("Malfi", "34556756766", 2000);
       company.addEmployee(e1);
       company.addEmployee(e2);
       System.out.println(" salaries sum = " + company.salariesSum());
       System.out.println("top salary employee = " + company.getMaxSalaryEmployee());
       System.out.println(" average salary = " + company.salaryAverage());
       company.dismissEmployee(e3);
       System.out.println("top salary employee = " + company.getMaxSalaryEmployee());
    }

}