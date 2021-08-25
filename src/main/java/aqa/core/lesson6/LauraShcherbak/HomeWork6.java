package aqa.core.lesson6.LauraShcherbak;

public class HomeWork6 {

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(10);
        Tree tree3 = new Tree(11,15);
        Tree tree4 = new Tree(12,15, 2);

        System.out.println("Tree 1: ");
        System.out.println("Height: "+tree1.getHeight());
        System.out.println("Diameter: "+tree1.getDiameter());
        System.out.println("Age: "+tree1.getAge());
        System.out.println(" ");

        System.out.println("Tree 2: ");
        System.out.println("Height: "+tree2.getHeight());
        System.out.println("Diameter: "+tree2.getDiameter());
        System.out.println("Age: "+tree2.getAge());
        System.out.println(" ");

        System.out.println("Tree 3: ");
        System.out.println("Height: "+tree3.getHeight());
        System.out.println("Diameter: "+tree3.getDiameter());
        System.out.println("Age: "+tree3.getAge());
        System.out.println(" ");

        System.out.println("Tree 4: ");
        System.out.println("Height: "+tree4.getHeight());
        System.out.println("Diameter: "+tree4.getDiameter());
        System.out.println("Age: "+tree4.getAge());
        System.out.println(" ");

        System.out.println("To String: ");
        System.out.println(tree4.toString());
        System.out.println(" ");

        System.out.println("Equals: ");
        System.out.println(tree4.equals(tree3));
        System.out.println(tree4.equals(tree4));
        System.out.println(" ");

        System.out.println("HashCode: ");
        System.out.println(tree4.hashCode());
        System.out.println(" ");

        Sakura sakura1 = new Sakura(5, 7, 4, true);

        sakura1.printTree();

        System.out.println("Sakura 1: ");
        System.out.println("Height: "+sakura1.getHeight());
        System.out.println("Diameter: "+sakura1.getDiameter());
        System.out.println("Age: "+sakura1.getAge());
        System.out.println("Flowers: "+sakura1.getFlowers());
        System.out.println(" ");

        System.out.println("To String: ");
        System.out.println(sakura1.toString());
        System.out.println(" ");

    }

}
