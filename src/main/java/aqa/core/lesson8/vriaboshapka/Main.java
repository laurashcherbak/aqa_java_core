package aqa.core.lesson8.vriaboshapka;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[]args){
        Circle myCircle=new Circle(22,"Green");
        Rectangle myRectange=new Rectangle("White",12.3,18.5);
        Triangle myTriangle=new Triangle("Red", 4,5.1, 6.5);
        Circle circle1=new Circle(11, "Pink");
        Circle circle2=new Circle(5,"Green");
        Triangle triangle1=new Triangle("Blue",8,5,9);
        Triangle triangle2=new Triangle("Violet", 7,3,4);
        Rectangle rectangle1=new Rectangle("Black", 12, 17);
        Rectangle rectangle2=new Rectangle("Yellow", 13, 18);
        Rectangle rectangle3=new Rectangle("Blue", 34,12);
        Rectangle rectangle4=new Rectangle("Red", 54, 18);
        Rectangle rectangle5=new Rectangle("White", 43,15);
        Rectangle rectangle6=new Rectangle("Lime", 23,17);

        Shape[]arr ={triangle1, triangle2, circle1, circle2,rectangle1,rectangle2};
        Rectangle[]arr1={rectangle4,rectangle2, rectangle3, rectangle1, rectangle5, rectangle6};
        Drawable []arr2={circle1,circle2,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,triangle1,triangle2};
        System.out.println("\n \n \ntask 2.3");
        for(Shape element:arr){
            System.out.println(element);
        }
        System.out.println("\n \n \ntask 3.1");
        if(rectangle1.compareTo(rectangle2) > 0) {
            System.out.println("rectangle1 is bigger than rectangle2");
        }else if (rectangle1.compareTo(rectangle2) < 0){
            System.out.println("rectangle 1 is smaller than rectangle 2");
        }else {
            System.out.println("rectangle 1 is equal to rectangle 2");
        }
        System.out.println("\n \n \ntask 3.2");
        Arrays.sort(arr1);
        for (Shape calc: arr1){
            calc.draw();
        }
        System.out.println("\n \n \ntask 4");
        Arrays.sort(arr2, new ShapeColorComparator());
        for(Drawable order:arr2){
            System.out.println(order);
        }


        }
    }




