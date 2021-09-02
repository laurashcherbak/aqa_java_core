package aqa.core.lesson11.RomanovYevgen;

import java.util.Scanner;

class HumanResources {
    public static void main(String[] args) {
        Company GL = new Company("GL", "Lviv, UA", "+3805023255__");
        GL.addNewEmployee("A", "+3805023255__", 700);
        GL.addNewEmployee("B", "+3805023255__", 450);
        GL.addNewEmployee("C", "+3805023255__", 300);
        menu(GL);
    }

    public static void menu (Company companyName) {
        int menu;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Press 1 to add new employee / Press 2 to dismiss an employee
                    Press 3 to get amount of the sallarry costs / Press 4 to get avarage sallarry in thecompany / Press 5 to get name of employee with highest salary\s
                    Press 6 to exit / Press 7 to show employee list""");
            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        companyName.addNewEmployee();
                        break;
                    case 2:
                        companyName.dismissAnEmployee();
                        break;
                    case 3:
                        System.out.println("Amount of Salary costs is" + companyName.theAmountOfSalaryCosts());
                        break;
                    case 4:
                        companyName.theAvarageSalary();
                        break;
                    case 5:
                        System.out.println("The highest salary has" + companyName.getNameOfEmployeeWithHighestSallary());
                        break;
                    case 6:
                        return;
                    case 7:
                        System.out.println(companyName.employee.toString());
                        break;
                    default:
                        System.out.println("Invalid inn, press '1' to '7'");
                        break;
                }
            }
        }
    }
}
