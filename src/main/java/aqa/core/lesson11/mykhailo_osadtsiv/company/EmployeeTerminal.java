package aqa.core.lesson11.mykhailo_osadtsiv.company;

import java.util.Scanner;

public class EmployeeTerminal {
    public static void main(Company company) {
//        Company multisoft = new Company("multisoft", "Lviv, UA", "0936193232");
//        multisoft.addNewEmployee("Bob", "0935655656", 600);
//        multisoft.addNewEmployee("Erika", "093544656", 500);
//        multisoft.addNewEmployee("Mike", "0936193232", 400);
        Scanner sca = new Scanner(System.in);
        int currentUserIndex = -1;
        boolean trueFalseName = false;
        while (!trueFalseName) {
            System.out.println("enter your name: ");
            String currentUserName = sca.nextLine();
            for (int i = 0; i < company.employee.size(); i++) {
                if (currentUserName.equals(company.employee.get(i).getName())) {
                    currentUserIndex = i;
                    trueFalseName = true;
                }
            }
            if (trueFalseName) {
                menu(company, currentUserIndex);
            } else {
                System.out.println("Wrong name!");
            }
        }
    }

    public static void menu (Company companyName, int currentUserIndex) {
        Scanner scan = new Scanner(System.in);
        int menu;
        while (true) {
            System.out.println("Press 1 to show your salary " +
                    "/ Press 2 to review your salary\nPress 3 to retire from work /" +
                    " Press 4 to exit");
            if (scan.hasNextInt() == true) {
                menu = scan.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Your salary is: " + companyName.employee.get(currentUserIndex).getSallarry());
                        break;
                    case 2:
                        companyName.employee.get(currentUserIndex).SalaryReview();
                        break;
                    case 3:
                        companyName.employee.remove(currentUserIndex);
                        return;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalit input command, press from '1' to '4'");
                        break;
                }
            } else {
                System.out.println("Invalit input command, press from '1' to '4'");
                menu(companyName, currentUserIndex);
            }
        }
    }
}
