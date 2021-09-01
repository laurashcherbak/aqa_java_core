package main.java.aqa.core.lesson10.vriaboshapka;

public class InvalidAgeException extends RuntimeException{
 public InvalidAgeException(String age_is_not_suitable){
     System.out.println("Age is not suitable");
 }

}
