package aqa.core.lesson6.RomanovYevgen;
import java.util.Objects;

public class HomeWork6 {
    public static int num = 1;


    public static void main(String[] args) {
        Owl Owl = new Owl() {
            @Override
            public void owlSingin() {

            }
        };
        WhiteOwl WhiteOwl = new WhiteOwl();
        System.out.println(Owl.getId());
        System.out.println(WhiteOwl.getId());

        Owl.fishGrow();
        System.out.println(Owl.getWeight());
        WhiteOwl.fishSays();

        System.out.println(Owl.toString());

        System.out.println(Owl.equals((Owl) WhiteOwl));
        System.out.println(Owl.hashCode());
        System.out.println(WhiteOwl.hashCode());

    }
}
