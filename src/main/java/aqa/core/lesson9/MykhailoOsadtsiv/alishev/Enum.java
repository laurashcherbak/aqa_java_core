package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

public class Enum {

    public static void main(String[] args) {
  /*      Animal animal = Animal.CAT;
      //  System.out.println(animal.getTranslation());
        System.out.println(animal);

        switch (animal) {
            case CAT:
                System.out.println("it's a cat");
                break;
            case DOG:
                System.out.println("it;s a dog");
                break;
            case FROG:
                System.out.println("it's a frog");
                break;
        }
*/
        //    Season season1 = Season.SUMMER;

        // Object -> Enum (something went wrong) -> Season

       // System.out.println(season1 instanceof Object);
       // System.out.println(season1.getClass());

    /*    switch (season1) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }
*/

        Season season = Season.SUMMER;
        System.out.println(season.name()); //return String

        Animal animal1 = Animal.valueOf("CAT"); // return enum

        Season season2 = Season.WINTER;
        System.out.println(season2.ordinal()); // return int index in enum declaration
    }
}
