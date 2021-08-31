package aqa.core.lesson8.alun;
//red shape

import java.util.Comparator;
abstract class Shape implements Drawable,Comparable {
    private String shapeColor;
    public Shape () {
        this.shapeColor = "RED";
    }
    public abstract double calcArea ();
    @Override
    public String toString() {
        return "This is Shape, color is: "+ shapeColor;
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
 //   public static void main (String args[]){
//       Shape nameShape = new Shape();
//       System.out.println("Task1: ");
//       System.out.println(nameShape.toString());
 //   }
}
