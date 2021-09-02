package aqa.core.lesson11.RomanovYevgen;
import java.util.*;

    public class Company {
        private String name;
        private String address;
        private String phoneNumber;
        public ArrayList<Employee> employee = new ArrayList<Employee>();

        public Company(String name, String address, String phoneNumber, ArrayList<Employee> employee) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.employee = employee;
        }

        public Company(String name, String address, String phoneNumber) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public ArrayList<Employee> getEmployee() {
            return employee;
        }

        public void setEmployee(ArrayList<Employee> employee) {
            this.employee = employee;
        }

        public String getNameOfEmployeeWithHighestSallary () {


            List<Employee> employeeList = new ArrayList<>(employee);
            employeeList.sort(Employee::compareToSalary);

            return employeeList.get(0).getName();
        }

        public void addNewEmployee () {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            Employee newEmployee = new Employee();

            System.out.println("Inn new  name: ");
            newEmployee.setName(sc.next());
            System.out.println("Inn new phone number: ");
            newEmployee.setPhoneNumber(sc.next());
            System.out.println("Inn new salary: ");
            newEmployee.setSallarry(sc.nextDouble());
            employee.add(newEmployee);
        }

        public void addNewEmployee (String name, String phoneNumber, double Sallary) {
            Employee newEmployee = new Employee();
            newEmployee.setName(name);
            newEmployee.setPhoneNumber(phoneNumber);
            newEmployee.setSallarry(Sallary);
            employee.add(newEmployee);
        }

        public void dismissAnEmployee () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inn name to dismiss: ");
            String dismissed = sc.next();
            boolean wasFired = false;
            for (int i = 0; i < employee.size(); i++) {
                if (dismissed.equals((employee.get(i)).getName())) {
                    employee.remove(i);
                    System.out.println("Employee " + dismissed + " is danger");
                    wasFired = true;
                }
            }
            if (!wasFired) {
                System.out.println("Name is not found, try again");
                dismissAnEmployee ();
            }
        }

        public double theAmountOfSalaryCosts () {
            double sum = 0;
            for (Employee value : employee) {
                sum += (value.getSallarry());
            }
            return sum;
        }



        public void theAvarageSalary () {
            System.out.println("Thesallary is: " + this.theAmountOfSalaryCosts () / employee.size());
        }
    }

