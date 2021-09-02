package aqa.core.lesson8.yesyp;

public abstract class Shape {
    private String shapeColor;
    public double area;

    public Shape() {
    }

    abstract public double calcArea ();
//    public Shape(String shapeColor) {
//        this.shapeColor = shapeColor;
//    }


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
}
