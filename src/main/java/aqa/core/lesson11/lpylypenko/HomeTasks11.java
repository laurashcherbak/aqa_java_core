package aqa.core.lesson11.lpylypenko;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTasks11 {

    public static void main(String[] args) {

        //for simplicity of testing eI used unique employee names
        // in real life ID should be used instead
        String inputLine = "";
        char action = ' ';
        Employee[] employees = new Employee[] {
                new Employee("John", "+1-518-383-9901", 9000),
                new Employee("Tom", "+1-518-383-6664", 12000),
                new Employee("Diane", "+1-518-383-4025", 5000),
                new Employee("Robert", "+1-518-383-7971", 16000),
                new Employee("Patrick", "+1-518-383-5503", 7000),
                new Employee("David", "+1-518-383-9905", 8000),
                new Employee("Kate", "+1-518-383-3334", 2000),
                new Employee("Mary", "+1-518-383-4545", 4500),
                new Employee("Steven", "+1-518-383-7845", 3500),
                new Employee("Bill", "+1-518-383-0456", 7500),
                new Employee("Peter", "+1-518-383-3578", 2500),
                new Employee("Mike", "+1-518-383-3895", 3500),
                new Employee("Amanda", "+1-518-383-1001", 4000)
        } ;
        Company company = new Company("1741 Technology Drive, Suite 400, San Jose, California 95110", "+1-408-273-8900", employees);

        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Input 1 to add new employee/ Input 2 to remove employee / Input 3 to get list of company employees");
                System.out.println("Input 3 to print sum of all salaries/ Input 4 to print average salary / Input 5 to print employee name with the highest salary");
                System.out.println("Input 7 to Exit");
                inputLine = br.readLine();
                action = inputLine.charAt(0);

                switch (action) {
                    case '1':
                        System.out.print("Input employee name: ");
                        String name = br.readLine();
                        System.out.print("Input employee phone: ");
                        String phone = br.readLine();
                        System.out.print("Input employee salary: ");
                        String salaryStr = br.readLine();
                        int salary = Integer.parseInt(salaryStr);
                        Employee emp = new Employee(name, phone, salary);
                        company.addEmployee(emp);
                        break;
                    case '2':
                        System.out.println("Input name of employee to remove");
                        String employeeName = br.readLine();
                        company.removeEmployee(employeeName);
                        break;
                    case '3':
                        System.out.println("Here is list of all company employees");
                        company.printEmployees();
                        break;
                    case '4':
                        System.out.println("Sum of all salaries is " + company.getSumOfAllSalaries());
                        break;
                    case '5':
                        System.out.println("Average company salary is " + company.getAverageSalary());
                        break;
                    case '6':
                        System.out.println("Employee name with the highest salary is " + company.getEmployeeNameWithMaxSalary());
                        break;
                    case '7': System.exit(0);
                    default:
                        System.out.println("You have written wrong or not supported action!");
                        break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("You entered non-number salary for employee!");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

