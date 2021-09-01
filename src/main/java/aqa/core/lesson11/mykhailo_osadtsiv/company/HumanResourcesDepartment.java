package aqa.core.lesson11.mykhailo_osadtsiv.company;

import java.util.Scanner;

public class HumanResourcesDepartment {
    public static void main(String[] args) {
        Company multisoft = new Company("multisoft", "Lviv, UA", "0936193232");
        multisoft.addNewEmployee("Bob", "0935655656", 600);
        multisoft.addNewEmployee("Erika", "093544656", 500);
        multisoft.addNewEmployee("Mike", "0936193232", 400);
        menu(multisoft);
    }

    public static void menu (Company companyName) {
        int menu;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to add new employee " +
                    "/ Press 2 to dismiss an employee\nPress 3 to get amount of salary costs /" +
                    " Press 4 to get avarage sallary in company / Press 5 to get name of employee with highest salary" +
                    " \nPress 6 to exit / Press 7 to show employee list");
            if (sc.hasNextInt() == true) {
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        companyName.addNewEmployee();
                        break;
                    case 2:
                        companyName.dismissAnEmployee();
                        break;
                    case 3:
                        System.out.println("The amount of Salary costs is: " + companyName.theAmountOfSalaryCosts());
                        break;
                    case 4:
                        companyName.theAvarageSalary();
                        break;
                    case 5:
                        System.out.println("The highest salary has: " + companyName.getNameOfEmployeeWithHighestSallary());
                        break;
                    case 6:
                        return;
                    case 7:
                        System.out.println(companyName.employee.toString());
                        break;
                    default:
                        System.out.println("Invalit input command, press from '1' to '7'");
                        break;
                }


            } else {
                System.out.println("Invalit input command, press from '1' to '7'");
                menu(companyName);
            }
        }

    }
}
