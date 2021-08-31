package aqa.core.lesson9.RmanovYevgen.part2;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Car";
        String myStr2 = "Motorcycle";
        firstNotSecond(myStr1, myStr2);
    }

    public static void firstNotSecond (String Car, String Motorcycle) {
        for (int i = Car.length() - 1; i >= 0; i--) {
            if (Motorcycle.indexOf(Car.charAt(i)) == -1) {
                System.out.println(Car.charAt(i + 1));
            }
        }
    }
}
