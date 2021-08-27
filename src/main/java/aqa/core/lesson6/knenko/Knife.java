package aqa.core.lesson6.knenko;

public class Knife extends Weapon{
    int length;
    int weight;

    public Knife(int radiusOfDefeat, String degreeOfDamage, String material, int length, int weight) {
        super(radiusOfDefeat, degreeOfDamage, material);
        this.radiusOfDefeat = radiusOfDefeat;
        this.degreeOfDamage=degreeOfDamage;
        this.material=material;
        this.length=length;
        this.weight=weight;

    }
    @Override
    public String toString() {
        return "This Knife has:\n1) radiusOfDefeat = " + radiusOfDefeat + " \n2) degreeOfDamage = " + degreeOfDamage + " \n3) material = " + material;
    }
    public void showLength(){
        System.out.println(this.length);
    }

    public void showWeight(){
        System.out.println(this.weight);
    }
}


