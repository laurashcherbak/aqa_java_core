package aqa.core.lesson8.yuliiaavrakhova;

import java.util.Comparator;

public class Circle extends Shape implements Comparable<Circle> {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String draw(){
        return "This is Circle ,  color: " + super.getShapeColor()+
                ", radius= "+radius+", area is: "+calcArea();
    }

    public int compareTo(Circle o){
        double difference  = this.calcArea() - o.calcArea();
        if (difference == 0){
            System.out.println("Circle are equal.");
            return 0;
        }
        else if(difference < 0){
            System.out.println("Circle first < Second.");
            return -1;
        }else {
            System.out.println("Circle first > Second.");
            return 1;
        }
    }
    @Override
    public double calcArea() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "This is Circle,"+
                "color is:" + super.getShapeColor() +
                ", radius=" + radius ;
    }

}
