package aqa.core.lesson7.YuliiaAvrakhova;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
//    @Override
//    public double getshapeColor() {
//        return shapeColor();
//    }
    @Override
    public double calcArea() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "This is Circle,"+
                "color is:" + super.getShapeColor() +
                ", radius=" + radius ;
    }

}
