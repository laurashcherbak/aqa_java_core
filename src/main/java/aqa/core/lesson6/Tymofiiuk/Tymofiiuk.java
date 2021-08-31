package aqa.core.lesson6.Tymofiiuk;

public class Tymofiiuk {
    public static void main(String[] args) {
        Bicycle bicycle0 = new Bicycle();
        Bicycle bicycle1 = new Bicycle("Centurion",
                "Mountain bike", "Yellow", Boolean.TRUE);
        System.out.println(bicycle1);
        Bicycle bicycle2 = new Bicycle();
        System.out.println(bicycle0.equals(bicycle1));
        System.out.println(bicycle0.hashCode());
        Used used = new Used("Giant",
                "Road Bike", "Black", Boolean.FALSE);
        System.out.println(used);
        used.printMakerAndModel();
    }
}
