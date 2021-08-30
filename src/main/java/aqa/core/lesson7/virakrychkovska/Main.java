package aqa.core.lesson7.virakrychkovska;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
    }


//  public static void main(String[] args) {
//        Circle circle = new Circle();
//       public Circle (); {
//          this.circleRadius = 10;
//        }
//        System.out.println("Shape area is: " + this.circleRadius);
//    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//       public Rectangle (); {
//            this.width = 11;
//            this.height = 22;
//            this.color = "RED";
//        }
//        double shapeArea = rectangle.calcArea();
//        System.out.println("This is Rectangle, color:" + this.color + ", width=" + this.width + ", height=" + this.height + "Shape area is: " + shapeArea);
//    }
//    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//       public Triangle (); {
//            this.a = 5;
//            this.b = 5;
//            this.c = 5;
//            this.color = "BLACK";
//        }
//        double shapeArea = triangle.calcArea();
//        System.out.println("This is Triangle, color:" + this.color + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + "Shape area is: " + shapeArea);
//    }
//    public static void main(String[] args) {
//        double shapeAreaC=0, shapeAreaR=0, shapeAreaT=0;
//        Shape[] arr = new Shape[1];
//        arr[0] = new Rectangle("GREEN", 22, 33);
//        arr[1] = new Rectangle("GREEN", 33, 44);
//        arr[2] = new Rectangle("GREEN", 44, 55);
//        arr[3] = new Rectangle("GREEN", 55, 66);
//        arr[4] = new Rectangle("GREEN", 66, 77);
//        arr[5] = new Circle("RED", 10);
//        arr[6] = new Circle("RED", 20);
//        arr[7] = new Triangle("BLACK", 10, 10, 10);
//        arr[8] = new Triangle("BLACK", 5, 5, 5);
//
//    for(Shape o:arr) {
//        if (o instanceof Circle)
//            shapeAreaC += o.calcArea();
//        System.out.println(o+"Circle Area is: "+shapeAreaC);
//    }
//        for(Shape r:arr) {
//        if (r instanceof Rectangle)
//            shapeAreaR += r.calcArea();
//        System.out.println(r+"Circle Area is: "+shapeAreaR);
//    }
//        for(Shape t:arr) {
//        if (t instanceof Triangle)
//            shapeAreaT += t.calcArea();
//        System.out.println(t+"Circle Area is: "+shapeAreaT);
//    }

}
