package aqa.core.lesson7.virakrychkovska;

public class Shape {
    private String shapeColor;

    public Shape() {
        this.shapeColor = "RED";
    }

    public double calcArea() {
        return (0.0);
    }
        @Override
        public String toString() {
            return "This is Shape, color is: " + this.shapeColor;
        }
}
