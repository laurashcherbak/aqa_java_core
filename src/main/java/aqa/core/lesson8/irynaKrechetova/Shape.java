package aqa.core.lesson8.irynaKrechetova;

abstract class Shape implements Drawable {
    public Shape() {
    }

    abstract double calcArea();

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
