package aqa.core.lesson2.yumykhalchuk;

/*
 Create a program which calculates the expression 14/209 + 14 * (29-13² + 14/3) and displays the result on the screen.*/

public class CalculateEx1 {
    public static void main(String[] args) {
        double n1 = 14;
        double n2 = 209;
        double n3 = 29;
        double n4 = 13;
        double n5 = 3;
        double exp;
        exp = n1/n2 + n1 * (n3 - Math.pow(n4, 2)+ n1/n5);
        //exp = 14/209 + 14 * (29 - Math.pow(13, 2) + 14/3);
        System.out.println(exp);



    }
}
