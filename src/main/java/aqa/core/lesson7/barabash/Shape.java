package aqa.core.lesson7.barabash;

//Define a Shape class as: public class Shape
public class Shape {
    //Declare private instance variable shapeColor of String type
    private String shapeColor;
    //Create a constructor for Shape with shapeColor parameter
    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape() {}

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    //Override toString() to return the string of Shape name and color, example: “This is Shape, color is: RED”
    @Override
    public String toString() {
        return "This is Shape, " +
                "color is: " + shapeColor;
    }
    //All shapes must has a method called calcArea(), write public method (empty) calcArea() that returns double value ( 0.0 ) .
    public double calcArea() {
        return 0.0;
    }
}
