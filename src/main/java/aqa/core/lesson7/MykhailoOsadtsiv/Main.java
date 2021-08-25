package aqa.core.lesson7.MykhailoOsadtsiv;

public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Shape("RED");
        System.out.println(sh1.toString());

        Circle si1 = new Circle("GREEN", 10);
        System.out.println(si1.toString());
        System.out.println("Shape area is : " + String.format("%.5f", si1.calcArea()));

        Rectange re1 = new Rectange("RED", 11, 22);
        System.out.println(re1.toString());
        System.out.println("Shape area is : " + String.format("%.0f",re1.calcArea()));

        Triangle tr1 = new Triangle("BLACK", 5, 5, 5);
        System.out.println(tr1.toString());
        System.out.println("Shape area is : " + String.format("%.3f",tr1.calcArea()));

        Shape[] arr = new Shape[9];
        arr[6] = new Rectange("RED", 11, 22);
        arr[1] = new Rectange("GREEN", 12, 23);
        arr[7] = new Rectange("BLACK", 13, 24);
        arr[3] = new Rectange("YELLOW", 14, 25);
        arr[4] = new Rectange("WHITE", 15, 26);
        arr[5] = new Circle("BLUE", 4);
        arr[0] = new Circle("BROWN", 5);
        arr[2] = new Triangle("BROWN", 5, 3, 4);
        arr[8] = new Triangle("ROYAL BLUE", 5, 7, 8);

        double sumArea=0;
        double sumRectArea=0;
        double sumTriangleArea=0;
        double sumCircleArea=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
            System.out.println("Shape area is : " + arr[i].calcArea());
            sumArea += arr[i].calcArea();
            if (arr[i] instanceof Rectange) {
                sumRectArea += arr[i].calcArea();
            }
            if (arr[i] instanceof Triangle) {
                sumTriangleArea += arr[i].calcArea();
            }
            if (arr[i] instanceof Circle) {
                sumCircleArea += arr[i].calcArea();
            }
        }
        System.out.println("Total area is :" + String.format("%.3f", sumArea));
        System.out.println("Rectangles total area: " + String.format("%.0f", sumRectArea));
        System.out.println("Triangles total area: " + String.format("%.3f", sumTriangleArea));
        System.out.println("Circles total area: " + String.format("%.3f", sumCircleArea));
    }
}
