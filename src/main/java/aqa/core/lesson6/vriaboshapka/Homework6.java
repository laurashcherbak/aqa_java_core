package aqa.core.lesson6.vriaboshapka;

public class Homework6 {
    public static void main (String[]args){
        Child child1=new Child();
        Child child2=new Child("Sonia","girl",7);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child1.equals(child2));
        Child child3=new Child();
        System.out.println(child1.equals(child3));
        System.out.println(child1.hashCode());
        System.out.println(child2.hashCode());
        System.out.println(child3.hashCode());
        Robot robot1=new Robot("metal", "Karl","boy",1);
        System.out.println(robot1);
        robot1.saySomething();
        robot1.showMaterial();
    }
}



