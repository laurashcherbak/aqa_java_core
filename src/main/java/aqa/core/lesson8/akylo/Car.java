package aqa.core.lesson8.akylo;

public class Car extends Vehicle implements Tanking, Comparable{
    private int maxSpeed;
    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString(){
        return "Car, maxSpeed = "+maxSpeed;
    }

    private int tank;

    @Override
    public String move() {
        return "moving";
    }


    public void tanking(int fuelAmount) {
        this.tank = this.tank + fuelAmount;
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car)o;
        if(this.maxSpeed>car.maxSpeed) return 1;
        if(this.maxSpeed<car.maxSpeed) return -1;
        return 0;
    }
}
