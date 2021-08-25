package aqa.core.lesson6.akylo.MarkiyanBednarchuk;

public class BallPen extends Pen{
    private String colour;

    public BallPen(String type, int numberOfUses, String colour) {
        super(type, numberOfUses);
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(){
        this.colour = colour;
    }
    public String toString() {
        return "Ball pen: " +
                "type - '" + type + '\'' +
                ", number of uses - " + numberOfUses +
                ", colour - " + colour;
    }
}
