package aqa.core.lesson11.lauraShcherbak;

abstract class Person implements Comparable {
    private String name;
    private String phone;
    private PhoneType phoneType;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public int compareTo(Object o) {
        Person x = (Person)o;
        if(this.getName().equals(x.getName())) {
            return 1;//equals
        }
        return 0;//not equals
    }

    public abstract double getSumSalaries();

    public enum PhoneType {
        MOBILE,
        HOME
    }

}
