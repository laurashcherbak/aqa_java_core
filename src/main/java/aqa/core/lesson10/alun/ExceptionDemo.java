package aqa.core.lesson10.alun;

public class ExceptionDemo {
    public static void main(String[] args) {
        Person namePerson = new Person();
        try {
            namePerson.setAge(121);
        }
        catch (InvalidAgeException ex){
            System.out.println("Task3 \ncatch3 - Age boundary out");  //+?=print(121)
        }
    }
}
