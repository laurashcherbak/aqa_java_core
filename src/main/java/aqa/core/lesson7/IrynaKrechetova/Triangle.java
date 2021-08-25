package aqa.core.lesson7.IrynaKrechetova;

import javafx.scene.shape.TriangleMesh;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    @Override
    public double calcArea() {
        return a*b*c;
    }

    @Override
    public String toString() {
        return "This is Triangle, color is: ".concat(this.getShapeColor()).concat(", a=").concat(Double.toString(this.a)).concat(", b=").concat(Double.toString(this.b)).concat(", c=").concat(Double.toString(this.c));
    }

    public Triangle(String shapeColor, double a, double b, double c){
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
