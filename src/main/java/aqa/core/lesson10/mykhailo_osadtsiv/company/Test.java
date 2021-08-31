package aqa.core.lesson10.mykhailo_osadtsiv.company;

import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {
        Company multisoft = new Company("multisoft", "Lviv, UA", "0936193232");
        multisoft.addNewEmployee();
        multisoft.addNewEmployee();
        multisoft.addNewEmployee();
        System.out.println(multisoft.getNameOfEmployeeWithHighestSallary());
    }
}
