package aqa.core.lesson11.sikyrynska;

public class Employee {
    public String n;
    public String phoneNum;
    public int salary;

    public Employee(String n, String phoneNum, int salary) {
        this.n = n;
        this.phoneNum = phoneNum;
        this.salary = salary;
    }

    public String getName() {
        return n;
    }

    public void setName(String n) {
        this.n = n;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int result = n != null ? n.hashCode() : 0;
        result = result + (phoneNum != null ? phoneNum.hashCode() : 0);
        result = result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + n + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", salary=" + salary +
                '}';
    }
}
