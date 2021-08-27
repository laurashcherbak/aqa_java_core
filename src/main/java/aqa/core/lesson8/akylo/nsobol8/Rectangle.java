package aqa.core.lesson8.akylo.nsobol8;

public class Rectangle {
    private String shapeColor;
    public double area;

    public Rectangle(String purple, int i, int i1) {
    }

    public void Shape() {
    }

    public  double calcArea(double area) {
        System.out.println("Area: " + area);
        return area;
    }

    public void Shape (String shapeColor) {
        this.shapeColor = shapeColor;
    }


    @Override
    public String toString() {
        return "This is Shape, color is:" + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void draw() {
    }
}
