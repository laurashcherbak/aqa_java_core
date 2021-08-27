package aqa.core.lesson8.yliiagnatuik;

public abstract class Shape implements Drawable {

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(this);
        System.out.println("Area is " + calcArea());
    }

    public abstract double calcArea();

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        return "This is a shape, color is " + this.shapeColor;
    }

}
