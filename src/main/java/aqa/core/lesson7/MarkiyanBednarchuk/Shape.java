package aqa.core.lesson7.MarkiyanBednarchuk;

public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea(){
        return 0.0;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    @Override
    public String toString() {
        return "This is Shape, colour is: " + shapeColor;
    }
    }