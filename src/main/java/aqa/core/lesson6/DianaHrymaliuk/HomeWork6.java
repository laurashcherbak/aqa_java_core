package aqa.core.lesson6.DianaHrymaliuk;

import aqa.core.lesson6.akylo.StaticSamples;

public class HomeWork6 {
    public static void main(String[] args) {
        Motocycle moto1 = new Motocycle(100, 50, 150, "I20");
        Motocycle moto2 = new Motocycle(250,"I232");
        Motocycle honda = new Honda();
        System.out.println(moto1);
        System.out.println(moto2);
        System.out.println(honda.getmodel());
        System.out.println(honda.getwaight());
        System.out.println(honda.getmaxSpeed());
        System.out.println(moto1.equals((Motocycle) moto2));
        System.out.println(moto1.hashCode());
        System.out.println(moto2.hashCode());
    }
}



