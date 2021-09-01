package aqa.core.lesson10.yesyp.ExceptionDemo;

public class Person {
    public String firstName ;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 120)
            throw new InvalidAgeException();
        this.age=0;
        if (age <0)
            throw new InvalidAgeException();
        this.age =age;
    }
}
