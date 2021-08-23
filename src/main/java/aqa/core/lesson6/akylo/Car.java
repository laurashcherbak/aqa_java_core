package aqa.core.lesson6.akylo;

public class Car {

    public static final int NUM_OF_WHEELS = 4;
    public int mileage;
    private int countOfWhils = 4;


    public Car(int mileage){
        this.mileage = mileage;
    }

    public void printCar() {
        System.out.println("Car");
    }

    public Integer getCountOfWhils() {
        return this.countOfWhils;
    }

    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        if (mileage != car.mileage) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (mileage ^ (mileage >>> 32));
        result = 31 * result + countOfWhils;
        return result;
    }


}
