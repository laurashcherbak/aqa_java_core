package aqa.core.lesson8.Tymofiiuk;

public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;
    private String shapeName;

    public Shape() {
    }

    public abstract double calcArea ();
    public Shape(String shapeColor, String shapeName) {
        this.shapeColor = shapeColor;
        this.shapeName = shapeName;
    }
    @Override
    public void draw() {
        System.out.println(toString() + this.shapeColor + ", area: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {

        double thisArea = calcArea();
        double otherArea = this.calcArea();
        if (thisArea == otherArea) {
            return 0;
        }
        if (thisArea < otherArea) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Shape and Color: " + shapeName + "" + shapeColor;
    }

}