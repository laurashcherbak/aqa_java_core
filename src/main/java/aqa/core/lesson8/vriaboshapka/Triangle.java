package main.java.aqa.core.lesson8.vriaboshapka;

import java.util.Comparator;

public class Triangle extends Shape implements Comparable {
    private double a;
    private double b;
    private double c;
    static String shapeName="Triangle";
    public String shapeColor;

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

    @Override
    public String getColor() {
        return this.shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(this+ " Area: "+this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Triangle other=(Triangle)o;
        if (this.calcArea()> other.calcArea()) return 1;
        if (this.calcArea()< other.calcArea()) return -1;
        return 0;
    }


}


