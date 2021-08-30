package aqa.core.lesson6.knenko;

import java.util.Objects;

public class Weapon {

    public int radiusOfDefeat;
    String degreeOfDamage;
    String material;

    public Weapon(int radiusOfDefeat, String degreeOfDamage, String material) {
        this.radiusOfDefeat = radiusOfDefeat;
        this.degreeOfDamage = degreeOfDamage;
        this.material = material;
    }

    public int getRadiusOfDefeat() {
    return radiusOfDefeat;
}


    public String toString() {
        return "This Weapon has:\n1) radiusOfDefeat = " + radiusOfDefeat + " \n2) degreeOfDamage = " + degreeOfDamage + " \n3) material = " + material;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Weapon weapon = (Weapon) other;
        if ((radiusOfDefeat != weapon.radiusOfDefeat)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

}







