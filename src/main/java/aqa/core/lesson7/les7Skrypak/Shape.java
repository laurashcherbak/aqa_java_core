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

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    //Encapsulation
    public String getShapeColor() {
        return shapeColor;
    }
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return "This is " + getShapeName() + " color is " + getShapeColor();
    }

    public double calcArea () {
        return (0.0);
    }

}
