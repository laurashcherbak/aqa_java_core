package aqa.core.lesson10.akylo.virakrychkovska;

public class Homework10 {
    public static void main(String[] args) {
        try {
            String msg = "GlobalLogic has a free courses.";
            throw new Exception(msg);
        }
        catch (Exception first) {
            System.out.println(first.getMessage());
        }
        finally {
            System.out.println("I will finish the course.");
        }
    }
}
