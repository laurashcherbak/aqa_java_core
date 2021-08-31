package aqa.core.lesson10.Nazarvdocyh_10.ExceptionDemo;

public class Main {

    public static void main(String[] args) {
        Person man = new Person("Nazar","Vdovych",24);
        man.setAge(24);
        try {
            man.setAge(121);
        } catch (InvalidAgeException e) {
        }
    }
}
