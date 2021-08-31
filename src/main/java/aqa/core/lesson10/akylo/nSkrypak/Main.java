package aqa.core.lesson10.akylo.nSkrypak;

public class Main {
    //constructor
    public void myException(String str) {
    }
    public static void main(String[] args) {
        try{
            throw new Exception("First");
        }catch (Exception s) {
            System.out.println(s.getMessage());
        }finally {
            System.err.println("Error");
        }
    }
}
