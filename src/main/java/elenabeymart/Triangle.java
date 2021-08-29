package elenabeymart;

public class Triangle extends Shape {
    private static final String Color = "blue";
    private final double a;
    private double b; //side
    private double c; // side
    public Triangle(double a, double b, double c) {
        super(Color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b, double c, double a1) {
        super("double a1");
        this.a = a1;
    }
    public double calcArea() {
        //Heron's formula:
        //A = SquareRoot(s * (s - a) * (s - b) * (s - c))
        //where s = (a+b+c) / 2, or 1/2 of the perimeter of the triangle
        double s = (a+b+c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public Object perimeter() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + ", a = "+a+", b=" +b+" , c = "+ c;
    }
}
