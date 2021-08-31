package aqa.core.lesson10.irynaKrechetova.exceptionDemo;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName; }
    public String getFirstName() {
        return this.firstName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) throws InvalidAgeException{
        if((age<120) && (age>0))
            this.age = age;
        else throw new InvalidAgeException("Age is out of boundaries");
    }
    public int getAge() {
        return this.age;
    }
}
