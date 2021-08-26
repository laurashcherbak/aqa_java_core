package aqa.core.lesson8.kfedechko;

public abstract class Shape implements Drawable{

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + shapeColor.toUpperCase();
    }
}
