package main.java.aqa.core.lesson7.virakrychkovska;

public class Triangle {
        private double a;
        private double b;
        private double c;
        private String color;

        public Triangle() {
            this.a = 5;
            this.b = 5;
            this.c = 5;
            this.color = "BLACK";
        }
    @Override
    public double calcArea() {
        double p=(a+b+c)/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Shape area is: " + area);
        return area;
    }
    @Override
    public String toString() {
        return "This is Triangle, color: " + this.color + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c;
    }
    public static void main(String args[]) {
        Circle firstTriangle = new Triangle();
        System.out.println(firstTriangle.toString());

        Circle secondTriangle = new Triangle();
        double shapeAreaT = secondTriangle.calcArea();
        System.out.println("Shape area is: " + shapeAreaT);
    }
}
