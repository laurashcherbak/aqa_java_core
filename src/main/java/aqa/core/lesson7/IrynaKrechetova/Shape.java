package aqa.core.lesson7.IrynaKrechetova;

public class Shape {
    public Shape() {
    }

    public double calcArea() {
        return 0.0;
    }

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "This is Shape, color is: ".concat(this.shapeColor);
    }

    public String getShapeColor() {
        return shapeColor;
    }

}
