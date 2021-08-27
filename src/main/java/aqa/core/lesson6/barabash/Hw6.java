package aqa.core.lesson6.barabash;

public class Hw6 {

    public static void main (String[]args){
        Child child1=new Child();
        Child child2=new Child("pants","Bangladesh",600);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child1.equals(child2));

        Child child3=new Child();
        System.out.println(child1.equals(child3));

        System.out.println(child1.hashCode());
        System.out.println(child2.hashCode());
        System.out.println(child3.hashCode());

        Clothes clothes1=new Clothes("cotton", "shirt","England",1000);
        System.out.println(clothes1);

        clothes1.printing();
        clothes1.materials();
    }
}

