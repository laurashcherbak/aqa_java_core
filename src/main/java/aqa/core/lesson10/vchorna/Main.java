package aqa.core.lesson10.vchorna;

public class Main {

    public static void main(String[] args) {
       try {
          throw new Exception("Test message");

       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("finally");
       }
    }
}

