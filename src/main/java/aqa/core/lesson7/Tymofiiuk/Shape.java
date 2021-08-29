package aqa.core.lesson7;

public class Shape {
    private String shapeColor;
    private String shapeName;
    public double area;

    public Shape() {
    }

    public  double calcArea(double area) {
        System.out.println("Area: " + area);
        return area;
    }

    public Shape(String shapeColor, String shapeName) {
        this.shapeColor = shapeColor;
        this.shapeName = shapeName;
    }


    @Override
    public String toString() {
        return "Shape and Color: " + shapeName + "" + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public String getShapeName() {
        return shapeName;
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
}