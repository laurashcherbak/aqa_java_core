package aqa.core.lesson6.Tymofiiuk;
import java.util.Objects;

public class Bicycle {
    String maker;
    String model;
    String color;
    Boolean used;

    public Bicycle(){
        this.maker="Centurion";
        this.model="Mountain bike";
        this.color= "Yellow";
        this.used =Boolean.FALSE;
    }
    public Bicycle( String maker, String model, String color, Boolean used){
        this.maker=maker;
        this.model=model;
        this.color=color;
        this.used =Boolean.FALSE;
    }
    public void printMakerAndModel(){
        System.out.println("Maker and model of bicycle: " +maker +"" +model);
    }
    @Override
    public String toString(){
        return  ("maker: " + this.maker +"\n" +
                "model: " + this.model+"\n"+
                "color: " + this.color +"\n"+
                "used: " + this.used+ "\n");
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
        Bicycle bicycle = (Bicycle) other;
        return Objects.equals(this.maker, bicycle.maker) && Objects.equals(this.model, bicycle.model)
                && this.color == bicycle.color;
    }
}
