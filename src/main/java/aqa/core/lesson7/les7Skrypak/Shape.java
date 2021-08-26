package aqa.core.lesson7.les7Skrypak;

public class Shape {
    //fields. Instance variable
    private String shapeColor;
    private String shapeName;

    //constructor
    public Shape(String shapeColor, String shapeName) {
        this.shapeColor = shapeColor;
        this.shapeName = shapeName;
    }

    //incapsulation
    public String getShapeColor() {
        return shapeColor;
    }
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return "This is " + shapeName + " color is " + shapeColor;
    }

    public double calcArea() {
        double result = 0.0;
        return result;
    }

}
