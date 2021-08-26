package aqa.core.lesson6.alun;

public class hw6 {

    public static void main (String[]args){
        Aircraft Aircraft1 = new Aircraft();
        Aircraft Aircraft2 = new Aircraft(2,3,1);
        System.out.println(Aircraft1.WheelPairs);
        System.out.println(Aircraft2.CockPit);
        System.out.println(Aircraft1);
        System.out.println(Aircraft1.equals(Aircraft2));

        Aircraft Aircraft3 = new Aircraft();
        System.out.println(Aircraft1.equals(Aircraft3));
        System.out.println(Aircraft1.hashCode());
        System.out.println(Aircraft2.hashCode());
        System.out.println(Aircraft3.hashCode());

        Military Military1 = new Military (3);
        System.out.println(Military1.WheelPairs);
        Military1.getCountOfWheelPairs();

    }
}
