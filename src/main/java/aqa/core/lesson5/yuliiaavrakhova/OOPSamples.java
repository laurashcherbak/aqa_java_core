package aqa.core.lesson5.yuliiaavrakhova;

import java.util.ArrayList;
import java.util.List;

public class OOPSamples {

    public static void main(String[] args) {
        Car myCar = new Car(); // creating instance of Car
        // set up car
        myCar.setModel("murcielago");
        myCar.setColor("yellow");
        myCar.setAmountOfPas(3);
        myCar.setGas(55);

        // construct some passengers
        Human driver = new Human("John", 23, Role.Driver);
        Human passenger = new Human("Patrick", 21, Role.Passenger);
        Human passenger1 = new Human();
        passenger1.setName("Rebecca");
        passenger1.setAge(18);
        passenger1.setRole(Role.Passenger);

        List<Human> passengers = new ArrayList<>();
        passengers.add(driver);
        passengers.add(passenger);
        passengers.add(passenger1);

        // put everyone in the car
         myCar.setPasstngers(passengers
        );
    }
}
