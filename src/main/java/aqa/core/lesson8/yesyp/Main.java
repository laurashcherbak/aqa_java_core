package aqa.core.lesson8.yesyp;

public class Main {
    public static void main(String[] args) {

        Shape [] arr = new Shape[9];
        arr [0]=new Circle("purple", 9);
        arr [1]= new Circle("grey", 7);
        arr [2] = new Rectangle("red", 13, 14);
        arr [3] = new Rectangle("green", 3, 7);
        arr [4] = new Rectangle("white", 5, 8);
        arr [5] = new Rectangle("black", 9, 11);
        arr [6] = new Rectangle("yellow", 6, 10);
        arr [7] = new Triangle("blue", 25, 16, 10);
        arr [8] = new Triangle("pink", 15, 12, 16);



        double sumArea =0;
        for (Shape s:arr)
            if (s != null) {
//                System.out.println(s.toString());
//                System.out.println("Shape area is:" + s);
                sumArea = sumArea + s.calcArea();
            }
        double sumAreaCircle = 0;
        for(  Shape n:arr)
            if (n instanceof Circle) {
                sumAreaCircle= sumAreaCircle+ n.calcArea();
            }

        double sumAreaTriangle = 0;
        for( Shape t:arr)
            if (t instanceof Triangle)
            {
                sumAreaTriangle= sumAreaTriangle+ t.calcArea();
            }

        double sumAreaRectangle = 0;
        for( Shape r : arr)
            if (r instanceof Rectangle) {
                sumAreaRectangle = sumAreaRectangle+ r.calcArea();
            }



        System.out.println("Total area:"+ sumArea);
        System.out.println("Total area for circles:"+sumAreaCircle);
        System.out.println("Total area for rectangles:" + sumAreaRectangle);
        System.out.println("Total area for triangles:" + sumAreaTriangle);


    }

}

