package aqa.core.lesson7.knenko;

public class Shape {
    private String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "This is  " + color +
                "  Shape";
    }

    public double calcArea() {
        return 0.0;
    }

}
