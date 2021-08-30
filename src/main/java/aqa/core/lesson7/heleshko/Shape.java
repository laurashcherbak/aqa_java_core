package aqa.core.lesson7.heleshko;

public class Shape {
    private final String shapeColor;

    private final String shapeName;

    public Shape(String shapeColor, String shapeName) {
        this.shapeColor = shapeColor;
        this.shapeName = shapeName;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return "This is " + shapeName + ", " + "color is: " + shapeColor;
    }

    public double calcArea() {
        return 0.0;
    }

}
