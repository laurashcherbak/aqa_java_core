package aqa.core.lesson6.vriaboshapka;

public class Robot extends Child  {
    String material;
    public Robot(String material, String name, String sex, int age){
        this.material=material;
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    @Override
    public void saySomething(){
        System.out.println("Beep beep: "+this.name);
    }
    public void showMaterial(){
        System.out.println(this.material);
    }

}
