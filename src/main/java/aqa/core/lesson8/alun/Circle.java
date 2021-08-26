package aqa.core.lesson8.alun;
import java.util.Comparator;
//Circle
public class Circle extends Shape {
    private double radius;
    private String color;
    public Circle () {
        this.radius = 10;
        this.color = "GREEN";
        }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calcArea(){
        return 3.14159265358979*radius*radius;
    }
    @Override
    public String toString() {
        return "This is Circle, color: "+color + " radius="+radius;
    }

    @Override
    public void Draw() {
    }

//    public static void main (String args[]){
//        Circle nameCircle = new Circle();
  //      System.out.println("Task2: ");
    //    System.out.println(nameCircle.toString());

      //  Circle name2Circle = new Circle ();
        //double Sc = name2Circle.calcArea();
        //System.out.println("Shape area is: " +Sc);
 //   }
}
