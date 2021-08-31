package aqa.core.lesson7.ylliagnatuik;

public class Shape {

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return 0.0;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        return "This is a shape, color is " + this.shapeColor;
    }
}
