package aqa.core.lesson8.vriaboshapka;

import java.util.Comparator;

public class Circle extends Shape implements Comparable {
    private double radius;
    public String shapeColor;
    static String shapeName="Circle";

    Circle (double radius, String shapeColor){
        this. radius = radius;
        this.shapeColor=shapeColor;
    }

    @Override
    public String toString() {
        return "This is Circle, color is: "+ this.shapeColor + " radius: "+this.radius;

    }

    @Override
    public double calcArea() {
        double val = Math.PI * radius*2;
        return val;
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
      Circle other=(Circle)o;
      if (this.calcArea()> other.calcArea()) return 1;
      if (this.calcArea()< other.calcArea()) return -1;
        return 0;
    }


}


