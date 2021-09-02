package aqa.core.lesson8.heleshko;

public abstract class Shape implements Drawable {
    private final String shapeColor;

    private final String shapeName;

    public Shape(String shapeColor, String shapeName) {
        this.shapeColor = shapeColor;
        this.shapeName = shapeName;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return "This is " + shapeName + ", " + "color is: " + shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String draw() {
        return this.toString();
    }
}
