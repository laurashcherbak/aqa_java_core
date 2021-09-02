package aqa.core.lesson11.irynaKrechetova;

public class Person implements Comparable {

    private String name;
    private double money;
    private String phoneNumber;


    public Person(String name, double money, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.money = money;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }


    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return (int) (this.money - p.getMoney());
    }
}
