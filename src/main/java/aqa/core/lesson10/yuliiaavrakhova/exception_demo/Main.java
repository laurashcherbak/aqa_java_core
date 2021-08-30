package aqa.core.lesson10.yuliiaavrakhova.exception_demo;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(121);
        } catch (InvalidAgeException e){
            System.out.println("Invalid age");
            e.printStackTrace();
        }
        System.out.println(p.getAge());
    }

}
