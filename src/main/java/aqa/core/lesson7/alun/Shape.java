package aqa.core.lesson7.alun;
//red shape
public class Shape {
    private String shapeColor;

    public Shape () {
        this.shapeColor = "RED";
    }
    public double calcArea () {
       return (0.0);
    }
    @Override
    public String toString() {
        return "This is Shape, color is: "+ shapeColor;
    }
    public static void main (String args[]){
       Shape nameShape = new Shape();
       System.out.println("Task1: ");
       System.out.println(nameShape.toString());
    }
}
