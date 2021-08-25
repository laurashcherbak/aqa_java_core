package aqa.core.lesson6.DianaHrymaliuk;

import aqa.core.lesson6.akylo.Car;

import java.util.Objects;

public class Motocycle {
    public int weight=70;
    public int fuelСonsumption;
    private int maxSpeed=200;
    public String model;

    public Motocycle(int weight, int fuelСonsumption, int maxSpeed, String model) {
        this.weight = weight;
        this.fuelСonsumption = fuelСonsumption;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public Motocycle(){
    }

    public Motocycle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }


    public String getmodel(){
        return this.model;
    }

    public int getmaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\n-waight: " + this.weight + "\n-fuelСonsumption: " + this.fuelСonsumption + "\n-maxSpeed: " + this.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Motocycle motocycle = (Motocycle) o;
        if (weight != motocycle.weight) return false;
        return true;
    }

    public int getwaight() {
        return this.weight;
    }
}