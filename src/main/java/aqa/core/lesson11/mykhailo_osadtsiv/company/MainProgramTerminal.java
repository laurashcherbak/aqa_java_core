package aqa.core.lesson11.mykhailo_osadtsiv.company;

import java.util.Locale;
import java.util.Scanner;

public class MainProgramTerminal {
    public static void main(String[] args) {
        Company multisoft = new Company("multisoft", "Lviv, UA", "0936193232");
        multisoft.addNewEmployee("Bob", "0935655656", 600);
        multisoft.addNewEmployee("Erika", "093544656", 500);
        multisoft.addNewEmployee("Mike", "0936193232", 400);

        ChooseYourDestiny role1 = ChooseYourDestiny.PROGRAMMER;
        ChooseYourDestiny role2 = ChooseYourDestiny.MANAGER;
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Who are you? Input 'PROGRAMMER' or 'MANAGER' ");
            input = scanner.nextLine();
            if (input.toUpperCase().equals(role1.name()) || input.toUpperCase().equals(role2.name())) {
                break;
            } else {
                System.out.println("Wrong role!!");
                continue;
            }
        }

        if (role1.name().equals(input.toUpperCase())) {
            EmployeeTerminal.main(multisoft);
        }
        if (role2.name().equals(input.toUpperCase())) {
            HumanResourcesDepartment.menu(multisoft);
        }
    }

}
