package aqa.core.lesson6;

public class lesson6 {
    public static void main (String[]args){
        laptop laptop1=new laptop();
        laptop laptop2=new laptop(  "Asus",
                "15",10000);
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop1.equals(laptop2));
        laptop laptop3=new laptop();
        System.out.println(laptop1.equals(laptop3));
        System.out.println(laptop1.hashCode());
        System.out.println(laptop2.hashCode());
        System.out.println(laptop3.hashCode());
        laptop laptop=new laptop("Dell",
                "17",12500);
        System.out.println(laptop1);
        laptop1.printing();
        laptop1.materials();
    }
}
