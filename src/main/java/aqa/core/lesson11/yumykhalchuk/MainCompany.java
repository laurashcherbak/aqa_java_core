package main.java.aqa.core.lesson11.yumykhalchuk;

public class MainCompany {
    public static void main(String[] args) {

        Company company = new Company("Epam", "Lviv, Stepanivny, 45","985326888");
        Company.Employee employee1 = new Company.Employee("Yulia", "984989417", 9000.500);
        Company.Employee employee2 = new Company.Employee("Vasyl", "964122854", 25000.60);
        Company.Employee employee3 = new Company.Employee("Vlada", "635241986", 22000.200);
        Company.Employee employee4 = new Company.Employee("Oksana", "662274531", 15000.30);
        Company.Employee employee5 = new Company.Employee("Halyna", "991122635", 9000.500);
        Company.Employee employee6 = new Company.Employee("Olga", "964122854", 45000.100);
        Company.Employee employee7 = new Company.Employee("Natalia", "635546728", 6000.500);
        Company.Employee employee8 = new Company.Employee("Roman", "632479315", 13000.300);

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);
        company.addEmployee(employee6);
        company.addEmployee(employee7);
        company.addEmployee(employee8);





    }
}
