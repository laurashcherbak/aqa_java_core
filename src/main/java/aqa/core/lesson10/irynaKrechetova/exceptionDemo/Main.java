package aqa.core.lesson10.irynaKrechetova.exceptionDemo;

public class Main {
    public static void main(String[] args) {
        Person Alice = new Person();
        try {
            Alice.setAge(150);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
