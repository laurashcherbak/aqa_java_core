package aqa.core.lesson10.yliiagnatuik.task3;

public class Person {

    private String firstName;
    private String lastName;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age == null || age < 1 || age > 120) {
            throw new InvalidAgeException();
        }
        this.age = age;
    }
}
