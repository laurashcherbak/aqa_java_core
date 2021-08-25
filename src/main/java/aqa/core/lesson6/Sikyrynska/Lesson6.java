package aqa.core.lesson6.Sikyrynska;

public class Lesson6 {
    public static void main (String[]args){
        Fruit fruit1=new Fruit();
        Fruit fruit2=new Fruit(  "Strawberry",
                "Ukraine","June", Boolean.FALSE);
        System.out.println(fruit2);
        Fruit fruit3=new Fruit();
        System.out.println(fruit1.equals(fruit2));
        System.out.println(fruit1.hashCode());
        BoneInTheFruit boneInTheFruit=new BoneInTheFruit("Mango",
                "Egypt","August", Boolean.TRUE);
        System.out.println(boneInTheFruit);
        boneInTheFruit.printNameOfTheFruit();
        boneInTheFruit.showBoneInTheFruit();
    }
}
