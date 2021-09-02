package aqa.core.lesson8.lpylypenko;

public abstract class Shape implements Drawable{
    protected String shapeColor; // default color

    public abstract double calcArea();

    @Override
    public String toString() {  return "This is " + this.getClass().getSimpleName() +", color is: " + shapeColor; }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }
}