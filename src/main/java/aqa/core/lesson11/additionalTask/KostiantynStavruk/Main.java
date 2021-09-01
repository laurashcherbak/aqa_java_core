package aqa.core.lesson11.additionalTask.KostiantynStavruk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Customer! \n Choose action:\n| Add company \t|");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        CompanyImpl company = null;
        try {
            while (true) {
                String line = reader.readLine();
                if (line.equals("stop")) {
                    return;
                }
                if (line.equalsIgnoreCase("Add company")) {
                    System.out.println("Enter company name:");
                    String companyName = reader.readLine();
                    System.out.println("Enter company adress:");
                    String companyAdress = reader.readLine();
                    System.out.println("Enter company phone Number:");
                    String companyPhone = reader.readLine();
                    company = new CompanyImpl(companyName, companyAdress, companyPhone);
                    System.out.println("Choose Action: \n| Add Employee \t|\t Show company \t|");
                    continue;
                }
                if (line.equalsIgnoreCase("Add Employee")) {
                    System.out.println("Enter Employee name:");
                    String employeeName = reader.readLine();
                    System.out.println("Enter Employee phone number:");
                    String employeePhone = reader.readLine();
                    System.out.println("Enter Employee Category: \t FIRST / SECOND / THIRD  ");
                    String employeeCategory = reader.readLine();
                    System.out.println("Enter Employee salary: \t if you don't know salary enter 0");
                    int employeeSalary = reader.read();
                    company.addNewEmployee(new Employee(employeeName, employeePhone, employeeSalary, knowCategory(employeeCategory)));
                    System.out.println("Choose Action: \n |\t Add Employee \t|\t Fire Employee " +
                            "\t|\t Show company \t|\n |\t Average salary \t|\t Max Salary");
                    continue;
                }
                if (line.equalsIgnoreCase("Fire Employee")) {
                    System.out.println("Enter employee name:");
                    String name = reader.readLine();
                    int emp = company.employees.indexOf(name);
                    company.fireEmployee(company.employees.get(emp));
                }
                if (line.equalsIgnoreCase("Show company")) {
                    System.out.println(company);
                    System.out.println("Choose Action: \n |\t Add Employee \t|\t Fire Employee " +
                            "\t|\t Show company \t|\n |\t Average salary \t|\t Max Salary");
                }
                if (line.equalsIgnoreCase("Average salary")) {
                    System.out.println("Average salary is " + company.averageSalary());
                    System.out.println("Choose Action: \n |\t Add Employee \t|\t Fire Employee " +
                            "\t|\t Show company \t|\n |\t Average salary \t|\t Max Salary");
                }
                if (line.equalsIgnoreCase("Max Salary")) {
                    System.out.println("Employee with max salary is " + company.employeeMaxSalary());
                    System.out.println("Choose Action: \n |\t Add Employee \t|\t Fire Employee " +
                            "\t|\t Show company \t|\n |\t Average salary \t|\t Max Salary");
                }
//                System.out.println("Incorrect input");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Category knowCategory(String string) {
        if (string.equals("FIRST")) {
            return Category.FIRST;
        }
        if (string.equals("SECOND")) {
            return Category.SECOND;
        }
        if (string.equals("THIRD")) {
            return Category.THIRD;
        }
        return null;
    }

}
