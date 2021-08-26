package aqa.core.lesson8.alun;
import java.util.Comparator;
//Rectangle
public class Rectangle extends Shape {
    private double width;
    private double height;
    private String color;
    public Rectangle () {
        this.height = 22;
        this.width = 11;
        this.color = "RED";
    }
    public Rectangle (Double height, Double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getColor() {
        return color;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public double calcArea() {
        return height*width;
    }
    @Override
    public String toString() {
        return "This is Rectangle, color: "+color + " width = " +width + " height = "+ height;
    }
    @Override
    public void Draw() {
    }
 //   public static void main (String args[]){
 //       Rectangle nameRect = new Rectangle();
 //       System.out.println("Task3: ");
   //     System.out.println(nameRect.toString());

     //   Rectangle name2Rect = new Rectangle ();
       // double Sr = name2Rect.calcArea();
        //System.out.println("Shape area is: " +Sr);
   // }
}
