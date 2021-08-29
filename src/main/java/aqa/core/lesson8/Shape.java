package aqa.core.lesson8;

abstract class Shape implements Drawable, Comparable<Shape> {
    private final String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(this + ", area is: " + calcArea());
    }

    @Override
    public int compareTo(Shape other) {
        double thisArea = calcArea();
        double otherArea = other.calcArea();

        return Double.compare(thisArea, otherArea);
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + shapeColor;
    }

    abstract double calcArea();

}