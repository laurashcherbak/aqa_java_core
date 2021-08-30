package main.java.aqa.core.lesson9.virakrychkovska;

public class HomeWork9 {
    public static void main(String[] arg) {
        String str = "My best education project in GlobalLogic";
        int i1 = str.indexOf('a');
        int i2 = str.lastIndexOf('b');
        String substr1 = str.substring(3, 6);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(substr1);

        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        System.out.println(str1);
    }
}