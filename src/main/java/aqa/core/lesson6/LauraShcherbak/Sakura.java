package aqa.core.lesson6.LauraShcherbak;

public class Sakura extends Tree{
    private boolean flowers = true;

    public Sakura(int height, int diameter, int age, boolean flowers) {
        this.setHeight(height);
        this.setDiameter(diameter);
        this.setAge(age);
        this.flowers = flowers;
    }

    public boolean getFlowers() {
        return flowers;
    }

    public void setFlowers(boolean flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return "This Tree has:\n1) height = " + getHeight() + " \n2) diameter = " + getDiameter() + " \n3) age = " + getAge() + " \n4) flowers = " + flowers;
    }

    public void printTree() {
        System.out.println("This is a tree");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o == null|| getClass()!= o.getClass()) {
            return false;
        }
        Sakura sakura = (Sakura) o;
        if((getHeight() != sakura.getHeight()) || (getDiameter() != sakura.getDiameter()) || (getAge() != sakura.getAge()) || (flowers != sakura.flowers)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int t;
        if (flowers) {
            t = 1;
        } else {
            t = 0;
        }
        int result = (int) (getHeight() ^ (getHeight() >>> 32));
        result = 31 * result + getAge();
        result = 30 * result + getDiameter();
        result = 29 * result + t;
        return result;
    }


}
