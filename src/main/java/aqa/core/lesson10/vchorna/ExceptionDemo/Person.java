package aqa.core.lesson10.vchorna.ExceptionDemo;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            throw new InvalidAgeException("Age must be from 1 to 120");
        }
        this.age = age;
    }
}
