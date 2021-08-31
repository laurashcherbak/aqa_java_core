package aqa.core.lesson7.LiubovPylypenko;

public class Shape {
    protected final String shapeColor; // default color

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return 0.0;
    };

    @Override
    public String toString() {  return "This is " + this.getClass().getSimpleName() +", color is: " + shapeColor; }
}