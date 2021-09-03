package lesson10ExceptionDemoBeymart;

public class Person {
    String FirstName;
    String LastName;
    int Age;
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if (Age < 1 || Age > 120);
        this.Age = age;
    }
}
