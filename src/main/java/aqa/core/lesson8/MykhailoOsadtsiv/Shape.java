package aqa.core.lesson8.MykhailoOsadtsiv;

public abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape() {}

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "This is Shape, " +
                "color is: " + shapeColor;
    }

    public abstract double calcArea();

    public abstract void draw();
}
