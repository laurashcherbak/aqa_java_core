package aqa.core.lesson2.akylo;

public class DataTypes {

    byte b1 = 100;
    short s2 = 0b1001;
    int i3 = 0x2f;
    long k4 = 2345678923456L;
    float f5 = 18.456F;
    double d6 = 77.234;
    char c7 = 'a';
    boolean b8 = true;
    String s = "Hello world";

    public static void main(String[] args) {
        assignOperators();
    }

    public static void assignOperators(){
        int x = 3;
        int a = 1;
        x+=a;
        System.out.println("x = "+x);
    }

}
