package aqa.core.lesson7.HalynaKuchabska;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        if (!this.isTriangleValid(this.a, this.b, this.c)) {
            System.out.println("Triangle is not valid");
            return -1;
        } else {
            double p = (this.a + this.b + this.c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    private boolean isTriangleValid(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c;
    }
}
