package aqa.core.lesson6.barabash;


public class Clothes extends Child  {
    String material;
    public Clothes(String material, String name, String country, int price){
        this.material=material;
        this.name=name;
        this.country=country;
        this.price=price;
    }
    @Override
    public void printing(){
        System.out.println("We call this clothes: "+this.name);
    }
    public void materials(){
        System.out.println(this.material);
    }
}

