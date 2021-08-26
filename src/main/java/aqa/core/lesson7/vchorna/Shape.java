package aqa.core.lesson7.vchorna;

public class Shape {

    private final String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public double calcArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "This is "+getClass().getSimpleName()+", color is: " + shapeColor;
    }

}
