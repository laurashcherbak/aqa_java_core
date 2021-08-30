package main.java.aqa.core.lesson7.vriaboshapka;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    static String shapeName="Triangle";
    private String shapeColor;

    public Triangle(String shapeColor, double a, double b, double c){
        this.shapeColor=shapeColor;
        this.a=a;
        this.b=b;
        this.c=c;
    }


    @Override
    public double calcArea() {
        int p= (int) ((this.a+this.b+this.c)/2);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public String toString(){
        return "This is Triangle, color is: " + this.shapeColor + " a: "+ this.a + " b: " + this.b+ " c: "+ this.c;
    }
}
