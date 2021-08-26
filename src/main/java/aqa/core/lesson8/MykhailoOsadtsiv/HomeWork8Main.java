package aqa.core.lesson8.MykhailoOsadtsiv;


import java.util.Arrays;


public class HomeWork8Main {
    public static void main(String[] args) {
        Circle si1 = new Circle("GREEN", 10);
        si1.draw();
        System.out.println("/////////////////////////////////////////////////");

        Shape[] arr = new Shape[9];
        arr[6] = new Rectangle("RED", 11, 22);
        arr[1] = new Rectangle("GREEN", 12, 23);
        arr[7] = new Rectangle("BLACK", 13, 24);
        arr[3] = new Rectangle("YELLOW", 14, 25);
        arr[4] = new Rectangle("WHITE", 15, 26);
        arr[5] = new Circle("BLUE", 4);
        arr[0] = new Circle("BROWN", 5);
        arr[2] = new Triangle("BROWN", 5, 3, 4);
        arr[8] = new Triangle("ROYAL BLUE", 5, 7, 8);

        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
        System.out.println("/////////////////////////////////////////////////");

        Rectangle re1 = new Rectangle("RED", 12, 24);
        Rectangle re2 = new Rectangle("GREEN", 11, 22);
        System.out.println(re1.compareTo(re2));
        System.out.println(" ");

        Rectangle[] arr2 = new Rectangle[6];
        arr2[5] = new Rectangle("RED", 11, 22);
        arr2[1] = new Rectangle("GREEN", 12, 23);
        arr2[4] = new Rectangle("BLACK", 13, 24);
        arr2[3] = new Rectangle("YELLOW", 14, 25);
        arr2[2] = new Rectangle("WHITE", 15, 26);
        arr2[0] = new Rectangle("WHITE", 17, 27);
        Arrays.sort(arr2, Rectangle::compareTo);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i].draw();
        }
        System.out.println("//////////////////////////////////////////////");

        Shape[] arr3 = new Shape[10];
        arr3[6] = new Rectangle("RED", 11, 22);
        arr3[1] = new Rectangle("GREEN", 12, 23);
        arr3[7] = new Rectangle("BLACK", 13, 24);
        arr3[3] = new Rectangle("YELLOW", 14, 25);
        arr3[4] = new Rectangle("WHITE", 15, 26);
        arr3[5] = new Circle("BLUE", 4);
        arr3[0] = new Circle("BROWN", 5);
        arr3[2] = new Triangle("BROWN", 5, 3, 4);
        arr3[8] = new Triangle("ROYAL BLUE", 5, 7, 8);
        arr3[9] = new Triangle("CHILD'S SURPRISE", 6, 4, 6);

        Arrays.sort(arr3, Shape::compare); //Сортування з абстрактним шейпом не працює, хоть я трісну...

        for (int i = 0; i < arr3.length; i++) {
            arr3[i].draw();
        }
    }
}
