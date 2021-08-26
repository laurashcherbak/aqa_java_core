package aqa.core.lesson7.vchorna;

public class Shape {
    public double calcArea;
    private final String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public double callArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "This is Shape, color is: " + shapeColor;
    }


    public Object calcArea() {
    }
}
