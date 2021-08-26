package aqa.core.lesson8.lauraShcherbak;

import java.util.Comparator;

abstract class Shape implements Drawable, Comparable {
    private String shapeColor;
    //private String shapeName;

    public Shape() {
        this.shapeColor = " ";
        //this.shapeName = "Shape";
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
        //this.shapeName = "Shape";
    }

    public String getShapeColor() {
        return shapeColor;
    }

 //   public String getShapeName() {
 //       return shapeName;
 //   }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

//    public void setShapeName(String shapeName) {
//        this.shapeName = shapeName;
//    }

    public abstract double calcArea();

    @Override
    public String toString() {
//        return "This is " + shapeName + ", colour is: " + shapeColor;
        return "This is Shape, colour is: " + shapeColor;
    }

    @Override
    public void draw() {
        //System.out.println("+++");
        System.out.println(toString()+", area is "+ calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape)o;
        if(this.calcArea() > shape.calcArea()) {
            return 1;
        }
        if(this.calcArea() < shape.calcArea()) {
            return -1;
        }
        return 0;
    }



}
