package aqa.core.lesson8.akylo;

import java.util.Arrays;

public class MainForTest {

    public static void main(String[] args) {
        Car car0 = new Car(100);
        System.out.println(car0.move());
        System.out.println(car0.getCountOfWh());


        Car[] myCars = {new Car(190),new Car(120),
                new Car(130),new Car(100),new Car(110)};
        Arrays.sort(myCars);
        for(Car car: myCars) {
            System.out.println(car);
        }

    }

}
