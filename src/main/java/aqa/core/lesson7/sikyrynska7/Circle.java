package aqa.core.lesson7.sikyrynska7;

public class Circle extends Shape{
    private double r;
    private String c;
    public Circle () {
        this.r = 25;
        this.c = "ORANGE";
    }
    public Circle(double r, String c) {
        this.r = r;
        this.c = c;
    }
    public double getR() {
        return r;
    }
    public void setRadius(double r) {
        this.r = r;
    }
    public String getC() {
        return c;
    }
    public void setC(String c) {
        this.c = c;
    }

    @Override
    public double calcArea(){
        return 3.1415 * r* r;
    }
    @Override
    public String toString() {
        return "This is Circle, color: " + c + " radius:"+ r;
    }
    public static void main (String args[]){
        Circle nameC = new Circle();
        System.out.println(nameC.toString());

        Circle nameCircle2 = new Circle ();
        double ShapeC = nameCircle2.calcArea();
        System.out.println("Shape area is: " +ShapeC);
    }
}
