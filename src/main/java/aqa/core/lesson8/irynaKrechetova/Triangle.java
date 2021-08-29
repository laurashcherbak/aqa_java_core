package aqa.core.lesson8.irynaKrechetova;

//import javafx.scene.shape.TriangleMesh;

public class Triangle extends Shape implements Comparable {

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

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
       Triangle triangle = (Triangle) o;
        if (this.calcArea()>triangle.calcArea()) return 1;
        if (this.calcArea()<triangle.calcArea()) return -1;
        return 0;
    }
}
