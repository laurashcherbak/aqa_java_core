package aqa.core.lesson8.MykhailoOsadtsiv;



public class HomeWork8Main {
    public static void main(String[] args) {
        Circle si1 = new Circle("GREEN", 10);
        System.out.println("");

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

        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }

    }
}
