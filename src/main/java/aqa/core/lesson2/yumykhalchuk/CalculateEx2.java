package aqa.core.lesson2.yumykhalchuk;

/*	Calculate expression (5+2∙3^2)/√(7∙4^2/(5+2∙2))*/

public class CalculateEx2 {
    public static void main(String[] args) {
        // 1-й запис
        double num = (5 + 2 * Math.pow(3, 2))/(Math.sqrt(7 * Math.pow(4, 2)/(5 + Math.pow(2, 2))));
        System.out.println(num);
        // 2-й запис
        //double num = (5 + (2 * 3 * 3))/Math.sqrt((7*4*4)/(5 + (2 * 2)));
        //System.out.println(num);
        //кінцеве число при двох записах трішки відрізняється, цікаво чому)


    }

}
