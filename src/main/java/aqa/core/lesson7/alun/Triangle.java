package aqa.core.lesson7.alun;
//Triangle
import static java.lang.Math.sqrt;
public class Triangle extends Shape {
    private double A;
    private double B;
    private double C;
    private String color;
    public Triangle () {
        this.A = 5;
        this.B = 5;
        this.C = 5;
        this.color = "BLACK";
    }
    public Triangle (Double A, Double B, Double C, String color) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.color = color;
    }
    public double getA() {
        return A;
    }
    public double getB() {
        return B;
    }
    public double getC() {
        return C;
    }
    public String getColor() {
        return color;
    }
    public void setA(double A) {
        this.A = A;
    }
    public void setB(double B) {
        this.B = B;
    }
    public void setC(double C) {
        this.C = C;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public double calcArea() {
        double p=(A+B+C)/2; //Число дядька Герона - в народі - "напівпериметр трикутника" :)
        return sqrt(p*(p-A)*(p-B)*(p-C)); //славнозвісна формула дядька Герона - економить час на роздуми ;)
    }
    @Override
    public String toString() {
        return "This is Triangle, color: "+color + ", A = " +A + ", B = "+ B+ ", C = " +C;
    }
    public static void main (String args[]){
        Triangle nameTr = new Triangle();
        System.out.println("Task4: ");
        System.out.println(nameTr.toString());

        Triangle name2Tr = new Triangle ();
        double St = name2Tr.calcArea();
        System.out.println("Shape area is: " +St);
    }
}
