package aqa.core.lesson6.OlyaYesyp;

public class Backpack {
    public static void main(String[] args) {
        BackpackClass s = new BackpackClass();
//        s.setHeight (30);
//        s.setWidth(15);
//        s.setColor("Red");
//        System.out.println("Color: "+ s.getColor());
//        System.out.println("Height: "+ s.getHeight()+ "cm");
//        System.out.println("Width: "+ s.getWidth()+ "cm");


        BackClassNew i = new BackClassNew();
//        i.printBackpackClass();
        System.out.println(BackClassNew.getMan());
        System.out.println(BackClassNew.getWomen);

        System.out.println("Equals: ");
        System.out.println(s.equals(i));

        System.out.println("Hashcode: ");
        System.out.println(s.hashCode());
        System.out.println(i.hashCode());

    }
}
