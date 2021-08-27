package aqa.core.lesson6.MykhailoOsadtsiv;

public class HomeWork6 {
    public static int index = 1;
    public static void main(String[] args) {
        Fish fish1 = new Fish(3.5f,true);
        Fish fish2 = new Fish();
        System.out.println(fish1.getId());
        System.out.println(fish2.getId());

        fish1.fishGrow();
        System.out.println(fish1.getWeight());
        fish2.fishSays();

        System.out.println(fish1.toString());

        System.out.println(fish1.equals((Fish) fish2));
        System.out.println(fish1.hashCode());
        System.out.println(fish2.hashCode());

        Shark shark1 = new Shark(5);
        shark1.fishSays();

        shark1.eatFish(fish1);
        System.out.println(shark1.getWeight());
        System.out.println(fish1.toString());
    }
}
