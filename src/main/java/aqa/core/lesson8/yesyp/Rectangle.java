package aqa.core.lesson8.yesyp;

import aqa.core.lesson8.akylo.Car;

public class Rectangle extends Shape implements Drawable, Comparable{
    private double width;
    private double height;
    private String shapeColor;
    private double area;

    public Rectangle ( double area, String shapeColor, double width, double height) {
        this.area = width * height;
        this.shapeColor=shapeColor;
        this.width= width;
        this.height=height;

    }
    @Override
    public int compareTo(Object o) {
        Rectangle rec = (Rectangle) o;
        return Double.compare(this.area, rec.area);
    }
    @Override
    public void draw (){area = width * height;
        System.out.println("Width:"+ width+System.lineSeparator()+ "Heidht:"+height+
                System.lineSeparator()+"Shape area is: " + area);}

    @Override
    public  double calcArea () {
        area = width * height;
        System.out.println("Shape area is: " + area);
        return area;
    }

    @Override
    public String toString (){
       return "This is rectangle, color is: " + shapeColor+ "Area:" + area ;
    }




    public String getShapeColor (){return shapeColor;}
    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth (double width){
        System.out.println("Width: "+ width);
        this.width=width;}


    public double getHeight() {
        return height;
    }
    public void setHeight (double height){
        System.out.println("Height: "+ height);
        this.height=height;}
    public double getArea() {
        return area;
    }
    public void setArea (double Area){
        System.out.println("Area: "+ Area);
        this.area= width * height;}
}
