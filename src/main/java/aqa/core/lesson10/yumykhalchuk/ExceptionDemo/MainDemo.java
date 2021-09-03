package aqa.core.lesson10.yumykhalchuk.ExceptionDemo;

public class MainDemo {
    public static void main(String[] args) {
        Person person2 = new Person();
        try{
            System.out.println("Please, set your age: ");
            person2.setAge(0);
        }catch(InvalidAgeException ex){
            System.out.println("You set invalid age value, please change value");
        }

    }



}
