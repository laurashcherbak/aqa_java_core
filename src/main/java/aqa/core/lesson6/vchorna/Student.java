package aqa.core.lesson6.vchorna;

import java.util.Objects;

class Student {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final Integer course;

    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        course = null;
    }

    public Student(String firstName, String middleName, String lastName, Integer course) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getCourse() {
        return course;
    }

    @Override
    public String toString() {
        String string = firstName + " " + middleName + " " + lastName;
        if (course != null) {
            string += ", " + course + " course";
        }
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(middleName, student.middleName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, course);
    }

}
