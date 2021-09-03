package aqa.core.lesson10.RomanovYevgen10;

public class Main {
    public class InvalidAgeException extends RuntimeException{
    }
    public static void main(String[] args) {
        System.out.println("Part 3");
        People p = new People();
        try {
            p.setAge(0);
        } catch (InvalidAgeException ex){
            System.out.println("ExDemo.main - Invalid Age");
            System.out.println(ex);
        }
    }

}
