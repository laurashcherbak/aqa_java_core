package aqa.core.lesson11.mykhailo_osadtsiv.company;

public class Test {
    public static void main(String[] args) {
        Company multisoft = new Company("multisoft", "Lviv, UA", "0936193232");
//        multisoft.addNewEmployee();
//        multisoft.addNewEmployee();
//        multisoft.addNewEmployee();
        multisoft.addNewEmployee("Bob", "0935655656", 600);
        multisoft.addNewEmployee("Erika", "093544656", 200);
        multisoft.addNewEmployee("Mike", "0936193232", 400);
        System.out.println(multisoft.getNameOfEmployeeWithHighestSallary());
//        multisoft.dismissAnEmployee();
        multisoft.theAmountOfSalaryCosts();
        multisoft.theAvarageSalary();
    }
}
