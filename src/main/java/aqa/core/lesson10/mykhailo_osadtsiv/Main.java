package aqa.core.lesson10.mykhailo_osadtsiv;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Silmarillion("Morgoth stole the Silmarils");
        } catch (Exception e) {
            System.out.println("The War of Wrath has begin!");
        } finally {
            System.out.println("multi was here. He drank honey, wine. They ran down his beard, but was not in his mouth");
        }
    }
}
