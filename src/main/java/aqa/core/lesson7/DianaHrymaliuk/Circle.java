package aqa.core.lesson7.DianaHrymaliuk;

public class Circle extends Shape {
    private double area;
    public String getshapeColor;

    public Circle(String shapeColor, double radius) {
        this(shapeColor);
        this.radius = radius;
        this.getshapeColor = shapeColor;
    }

    public Circle(String shapeColor) {
        super(shapeColor);
    }

    public double getRadius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    private double radius;
    public double calcArea;


    public double calcArea(){
        calcArea = Math.PI * (Math.pow(this.radius, 2));;
        return this.calcArea;
    }

    @Override
    public String toString() {
        return "This is Circle, color is: " + this.getshapeColor + ". radius= " + this.radius + ". Shape area is: " + this.calcArea();
    }
}

