package aqa.core.lesson6.barabash;

import java.util.Objects;

public class Child {
    String name;
    String country;
    int price;

    public Child(){
        this.name="T-shirt";
        this.country="Turkey";
        this.price=220;
    }
    public Child(String name, String country, int price){
        this.name=name;
        this.country=country;
        this.price=price;
    }
    public void printing(){
        System.out.println("We call this clothes: "+name);
    }
    @Override
    public String toString(){
        return "name: "+this.name+"\ncountry: "+this.country+"\nprice: "+this.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other== null || getClass() !=other.getClass())
            return false;
        Child child = (Child) other;
        return Objects.equals(this.name, child.name) && Objects.equals(this.country, child.country) && this.price== child.price;
    }


}


