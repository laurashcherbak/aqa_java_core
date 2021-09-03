package aqa.core.lesson10.lpylypenko;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return this.age; }
    public void setAge(int age) {
        if ( (age < 1) || (age > 120))
        {
            throw new InvalidAgeException();
        }
        this.age = age;
    }

}
