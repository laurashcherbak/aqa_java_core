package aqa.core.lesson7.sikyrynska7;

public class Rectangle extends Shape {
    private double w;
    private double h;
    private String c;
    public Rectangle () {
        this.h = 15;
        this.w = 23;
        this.c = "BLUE";
    }
    public Rectangle (Double h, Double w, String c) {
        this.h = h;
        this.w = w;
        this.c = c;
    }
    public double getW() {
        return w;
    }
    public double getH() {
        return h;
    }
    public String getC() {
        return c;
    }
    public void setWidth(double w) {
        this.w = w;
    }
    public void setH(double h) {
        this.h = h;
    }
    public void setColor(String c) {
        this.c = c;
    }
    @Override
    public double calcArea() {
        return h * w;
    }
    @Override
    public String toString() {
        return "This is Rectangle with color: " + c + " width = " + w + " height = "+ h;
    }
    public static void main (String args[]){
        Rectangle nameR1 = new Rectangle();
        System.out.println(nameR1.toString());

        Rectangle nameR2 = new Rectangle ();
        double ShapeR = nameR2.calcArea();
        System.out.println("Shape is: " + ShapeR);
    }
}
