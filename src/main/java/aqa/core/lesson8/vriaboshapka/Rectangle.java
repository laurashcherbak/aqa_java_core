package aqa.core.lesson8.vriaboshapka;

import java.util.Comparator;

public class Rectangle extends Shape implements Comparable {
    private double width;
    private double height;
    static String shapeName="Rectangle";
    public String shapeColor;

    public Rectangle(String shapeColor,double width, double height){
        this.shapeColor=shapeColor;
        this.width=width;
        this.height=height;
    }
    @Override
    public double calcArea(){
        double val=width*height;
        return val;
    }
    @Override
    public String toString(){
        return "This is Rectangle , color is: " + this.shapeColor + " width: "+ this.width + " height: " + this.height;
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
        Rectangle other=(Rectangle)o;
        if (this.calcArea()> other.calcArea()) return 1;
        if (this.calcArea()< other.calcArea()) return -1;
        return 0;
    }


}
