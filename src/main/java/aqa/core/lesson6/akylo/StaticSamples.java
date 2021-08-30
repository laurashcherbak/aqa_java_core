package aqa.core.lesson6.akylo;


public class StaticSamples {

    public static void main(String[] args) {
        Car car1 = new Car(10);
        Car car2 = new Car(10);
        Car car3 = car1;
        SportCar sportCar = new SportCar(32);
        Bus bus = new Bus(32);
//        sportCar.printCar();
        System.out.println(car1.getCountOfWhils());
        System.out.println(sportCar.getCountOfWhils());
        System.out.println(bus.getCountOfWhils());

        StaticSamples staticSamples = new StaticSamples();
        staticSamples.printString("");

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }

    public static void print(String string){
        System.out.println(string);
    }

    public String printString(String string){
        string = string ;
        return string;
    }
}
