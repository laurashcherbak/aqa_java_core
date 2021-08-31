package aqa.core.lesson10.mykhailo_osadtsiv.company;

import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {
        Company multisoft = new Company("multisoft", "Lviv, UA", "0936193232");
//        multisoft.addNewEmployee();
//        multisoft.addNewEmployee();
//        multisoft.addNewEmployee();
        multisoft.addNewEmployee("Bob", "0935655656", 100);
        multisoft.addNewEmployee("Erika", "093544656", 200);
        multisoft.addNewEmployee("Mike", "0936193232", 400);
        System.out.println(multisoft.getNameOfEmployeeWithHighestSallary());
//        multisoft.dismissAnEmployee();
        System.out.println("The amount of salary costs: " + multisoft.theAmountOfSalaryCosts());
        System.out.println("The avarage salary is: " + multisoft.theAvarageSalary());
    }
}
