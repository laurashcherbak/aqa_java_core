package aqa.core.lesson7.RomanovYevgen;

public class Shape {
    private String shapeColor;
    public Shape() {
        this.shapeColor = " ";
    }
    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public String getShapeColor() {
        return shapeColor;
    }
    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public double calcArea() {
        return 0.0;
    }
    public String toString() {
        return "The Shape colour is: " + shapeColor;
    }

}
