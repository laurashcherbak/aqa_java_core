package main.java.aqa.core.lesson10.vriaboshapka;

public class Main1 {
    public static void main(String[]arg){
try{
    Person Peter=new Person();
    Peter.setAge(135);
} catch (InvalidAgeException e) {
    e.printStackTrace();
}
    }
}
