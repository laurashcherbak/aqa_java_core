package aqa.core.lesson6.knenko;

public class Homework6 {

    public static void main(String[] args) {
        Weapon weapon1=new Weapon(100,"high", "metal");
        Weapon weapon2=new Weapon(80,"high", "metal");
        Weapon weapon3=weapon1;
        Rifle rifle1=new Rifle(10, 9, 100,"lethal","plastic and metal");
        Knife knife1=new Knife(1, "light","steel and wooden hand",210, 300);



        System.out.println(weapon1);
        System.out.println(weapon2);
        System.out.println(weapon3);

        System.out.println(rifle1);
        System.out.println("Rifle is made of: ");
        rifle1.showMaterial();
        System.out.println("The number of bullets is: "+ rifle1.getCountOfBullets());


        System.out.println("The radius of defeat:");
        rifle1.showRadiusOfDefeat();

        System.out.println(knife1);
        System.out.println("The length of the knife is:");
        knife1.showLength();
        System.out.println("The weight of the knife is:");
        knife1.showWeight();

    }

}
