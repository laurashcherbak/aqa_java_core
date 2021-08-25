package aqa.core.lesson6.ovlasiuk;

import java.util.Objects;

public class laptop {
    String brand;
    String screenSize;
    int price;
    private boolean material;

    public laptop() {
        this.brand = "Acer";
        this.screenSize = "17";
        this.price = 15000;
    }

    public laptop(String brand, String screenSize, int price) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.price = price;
    }

    public void printing() {
        System.out.println("It's new laptop" + brand);
    }

    @Override
    public String toString() {
        return "brand: "+this.brand+"\nscreenSize: " +this.screenSize+"\nprise: " +this.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass())
            return false;
        laptop laptop = (laptop) other;
        return Objects.equals(this.brand, laptop.brand) && Objects.equals(this.screenSize, laptop.screenSize) && this.price == laptop.price;
    }

    public void materials() {
        System.out.println(this.material);
    }
}

