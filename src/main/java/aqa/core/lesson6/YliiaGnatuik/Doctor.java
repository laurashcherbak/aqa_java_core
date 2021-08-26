package aqa.core.lesson6.YliiaGnatuik;

import java.util.Objects;

public abstract class Doctor {

    private String userName;
    private String firstName;
    private String lastName;
    private Integer age;
    private String phoneNumber;

    public Doctor(String userName, String firstName, String lastName, Integer age, String phoneNumber) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public abstract Specification getSpecification();

    protected boolean isHomeDoctor() {
        return true;
    }

    public String patientExamination() {
        //submit the date of examination to database with comments
        return "Base examination things are done";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return getUserName().equals(doctor.getUserName()) && getFirstName().equals(doctor.getFirstName()) && getLastName().equals(doctor.getLastName()) && getAge().equals(doctor.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getFirstName(), getLastName(), getAge());
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
