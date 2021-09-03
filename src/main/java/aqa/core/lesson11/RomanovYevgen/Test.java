package aqa.core.lesson11.RomanovYevgen;

public class Test {

    public static void main(String[] args) {

        Company GL = new Company("GL", "Lviv, UA", "+3805023255__");

        GL.addNewEmployee("A", "+3805023255__", 700);
        GL.addNewEmployee("B", "+3805023255__", 450);
        GL.addNewEmployee("C", "+3805023255__", 300);
        System.out.println(GL.getNameOfEmployeeWithHighestSallary());
        GL.theAmountOfSalaryCosts();
        GL.theAvarageSalary();
    }
}
