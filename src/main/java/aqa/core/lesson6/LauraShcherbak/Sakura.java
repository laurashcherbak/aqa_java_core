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

}
