package aqa.core.lesson6.Sikyrynska;

public class BoneInTheFruit extends Fruit {
    Boolean boneInTheFruit;
    public BoneInTheFruit( String name, String growsIn, String month, Boolean boneInTheFruit){
        this.name=name;
        this.growsIn=growsIn;
        this.month=month;
        this.boneInTheFruit=boneInTheFruit;
    }
    @Override
    public void printNameOfTheFruit(){
        System.out.println ("Name of fruit: "+this.name);
    }
    public void showBoneInTheFruit(){
        System.out.println("Bone in this fruit: " + this.boneInTheFruit);
    }
}
