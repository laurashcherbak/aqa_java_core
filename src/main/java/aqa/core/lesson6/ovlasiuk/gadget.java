package aqa.core.lesson6.ovlasiuk;

public class gadget extends laptop {
    String material;
    public gadget(String material, String brand, String screenSize, int price){
        this.material=material;
        this.brand=brand;
        this.screenSize=screenSize;
        this.price=price;
    }
    @Override
    public void printing(){
        System.out.println("It's new laptop"+this.brand);
    }
    public void materials(){
        System.out.println(this.material);
    }

}
