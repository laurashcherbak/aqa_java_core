package lesson10elenabeymart;

import java.io.FileNotFoundException;

public class FirstExceprtion {
    FirstExceprtion(String msg) {
        msg = "this is bound to execute";
        System.out.println(msg);
    }

    public static void main(String[] args) throws Exception {
        try {
            //If program is unable to find File
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new Exception("File not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //This block will get executed whether exception occurs or not.
            System.out.println("I will get printed");
        }
    }
}
