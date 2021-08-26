package aqa.core.lesson7.Yesyp;

public class Main {
    public static void main(String[] args) {

        Shape [] arr1 = new Shape[9];
        int i;
            new Rectangle("red", 13, 14);
            new Rectangle("green", 3, 7);
            new Rectangle("white", 5, 8);
            new Rectangle("black", 9, 11);
            new Rectangle("yellow", 6, 10);
            new Circle("purple", 9);
            new Circle("grey", 7);
            new Triangle("blue", 25, 16, 10);
            new Triangle("pink", 15, 12, 16);



        double sumArea =0;
        for( i=0; i<arr1.length; i++);
            System.out.println(arr1[i].toString());
            System.out.println("Shape area is:" + arr1[i].calcArea());
            sumArea = sumArea + arr1[i].calcArea();

        double sumAreaCircle = 0;
        for( i=0; i<arr1.length; i++);
            if (arr1[i] instanceof Circle) {
                sumAreaCircle= sumAreaCircle+ arr1[i].calcArea();
                }

        double sumAreaTriangle = 0;
        for( i=0; i<arr1.length; i++);
            if (arr1[i] instanceof Triangle) {
                sumAreaTriangle= sumAreaTriangle+ arr1[i].calcArea();
            }

        double sumAreaRectangle = 0;
        for( i=0; i<arr1.length; i++);
            if (arr1[i] instanceof Rectangle) {
                sumAreaRectangle = sumAreaRectangle+ arr1[i].calcArea();
            }



        System.out.println("Total area:"+ sumArea);
        System.out.println("Total area for circles:"+sumAreaCircle);
        System.out.println("Total area for rectangles:" + sumAreaRectangle);
        System.out.println("Total area for triangles:" + sumAreaTriangle);


    }
}
