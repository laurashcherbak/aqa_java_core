package aqa.core.lesson6.sikyrynska7;

public class Shape {
    private String shapeC;
    public Shape () {
        this.shapeC = "BLUE";
    }
    public double calcArea () {
        return (1.0);
    }
    @Override
    public String toString() {
        return "This is Shape, color is: "+ shapeC;
    }
    public static void main (String args[]){
        Shape nameShape = new Shape();
        System.out.println(nameShape.toString());
    }
}
