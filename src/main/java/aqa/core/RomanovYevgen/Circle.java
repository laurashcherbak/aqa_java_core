package aqa.core.RomanovYevgen;

public class Circle {
    private static final Object String = 'x';
    private double radius;

    public Circle(String color, double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "The Circle color %s, radius=%s".formatted(toString(), radius);
    }

}
