package aqa.core.lesson6.knenko;

public class Rifle extends Weapon {
    public int CountOfBullets;
    public int caliber;


    public Rifle(int CountOfBullets, int caliber, int radiusOfDefeat, String degreeOfDamage, String material) {
        super(radiusOfDefeat, degreeOfDamage, material);
        this.CountOfBullets = CountOfBullets;
        this.caliber = caliber;
        this.radiusOfDefeat = radiusOfDefeat;
        this.degreeOfDamage = degreeOfDamage;
        this.material = material;
    }

    public Integer getCountOfBullets() {
        return this.CountOfBullets;
    }

    @Override
    public String toString() {
        return "This Rifle has:\n1) radiusOfDefeat = " + radiusOfDefeat + " \n2) degreeOfDamage = " + degreeOfDamage + " \n3) material = " + material;
    }

    //public int getCountBullets(){
    //    return 10;
    //int ln("Number of bullets: "+this.CountOfBullets);

    public void showMaterial() {
        System.out.println(this.material);
    }

    public void showRadiusOfDefeat() {
        System.out.println(this.radiusOfDefeat);
    }


    }

