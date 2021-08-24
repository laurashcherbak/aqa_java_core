package aqa.core.lesson6.akylo.Sikyrynska;
import java.util.Objects;

public class Fruit {
    String name;
    String growsIn;
    String month;
    Boolean boneInTheFruit;

    public Fruit(){
        this.name="Strawberry";
        this.growsIn="Ukraine";
        this.month= "June";
        this.boneInTheFruit =Boolean.FALSE;
    }
    public Fruit( String name, String growsIn, String month, Boolean boneInTheFruit){
        this.name=name;
        this.growsIn=growsIn;
        this.month=month;
        this.boneInTheFruit =Boolean.FALSE;
    }
    public void printNameOfTheFruit(){
        System.out.println("Name of fruit: " +name);
    }
    @Override
    public String toString(){
        return  ("name: " + this.name +"\n" +
                "growsIn: " + this.growsIn+"\n"+
                "month: " + this.month +"\n"+
                "Bone in the fruit: " + this.boneInTheFruit+ "\n");
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other== null || getClass() !=other.getClass())
            return false;
        Fruit fruit = (Fruit) other;
        return Objects.equals(this.name, fruit.name) && Objects.equals(this.growsIn, fruit.growsIn)
                && this.month == fruit.month;
    }
}
