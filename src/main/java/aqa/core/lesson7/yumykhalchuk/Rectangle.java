package aqa.core.lesson7.yumykhalchuk;

public class Rectangle extends Shape{
    private double width;
    private double height;
    private double sumRectArea;

    public Rectangle(){

    }
    public Rectangle(double sumArea){
        super(sumArea);

    }

    public Rectangle(String shapeName, String shapeColor, double width, double height) {
        super(shapeName, shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double area = width * height;
        return area;
    }


    @Override
    public String toString() {
        return "This is" + " " + getShapeName() +", color is:" + " " + getShapeColor() + ", width =" + " " + width + " , height =" + " " + height  ;
    }
}
