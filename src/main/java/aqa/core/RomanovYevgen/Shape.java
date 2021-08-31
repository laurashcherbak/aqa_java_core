package aqa.core.RomanovYevgen;

public abstract class Shape implements Drawable, Comparable {
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
        return calcArea();
    }
    public String toString() {
        return "The Shape color: " + shapeColor;
    }

}
