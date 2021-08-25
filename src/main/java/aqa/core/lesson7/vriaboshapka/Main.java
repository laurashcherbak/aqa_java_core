package main.java.aqa.core.lesson7.vriaboshapka;

public class Main {
    public static void main(String[]args){
        Shape myShape=new Shape("Blue");
        Circle myCircle=new Circle(22,"Green");
         Rectangle myRectange=new Rectangle("White",12.3,18.5);
         Triangle myTriangle=new Triangle("Red", 4,5.1, 6.5);
         Circle circle1=new Circle(11, "Pink");
         Circle circle2=new Circle(5,"Green");
         Triangle triangle1=new Triangle("Blue",8,5,9);
         Triangle triangle2=new Triangle("Violet", 7,3,4);
         Rectangle rectangle1=new Rectangle("Black", 12, 17);
         Rectangle rectangle2=new Rectangle("Yellow", 13, 18);
        Shape[]arr ={triangle1, triangle2, circle1, circle2,rectangle1,rectangle2};
        double sumArea=0;
        double sumRectArea=0;
        double sumCircleArea=0;
        double sumTriangleArea=0;
        for(Shape s: arr) {
            double area = s.calcArea();
            System.out.println(s.toString()+" area is: "+area);
            if (s instanceof Rectangle) {
                sumRectArea+=area;
            }
            if (s instanceof Circle) {
                sumCircleArea+=area;
            }
            if (s instanceof Triangle) {
                sumTriangleArea+=area;
            }
            sumArea+=area;
        }
        System.out.println("Rectangles total area: "+sumRectArea);
        System.out.println("Circle total area: "+sumCircleArea);
        System.out.println("Triangle total area: "+sumTriangleArea);
        System.out.println("Total area: "+sumArea);
        }

    }


