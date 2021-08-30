package aqa.core.lesson10.lpylypenko;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Task3");

        try {
            Person person1 = new Person();
            person1.setAge(50);

            Person person2 = new Person();
            person2.setAge(200);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
