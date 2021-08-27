package aqa.core.lesson8.akylo.nsobol8;

public class Shape {
    public Shape(String shapeColor) {
        abstract class Shape implements Drawable, Comparable<Shape> {
            private final String shapeColor;

            public Shape(String shapeColor) {
                this.shapeColor = shapeColor;
            }

            @Override
            public void draw() {
                System.out.println(this + ", area is: " + calcArea());
            }

            @Override
            public int compareTo(Shape other) {
        /*
        0 - однакові
        -1 - this < other
        1 - this > other
         */
                double thisArea = calcArea();
                double otherArea = other.calcArea();
                if (thisArea == otherArea) {
                    return 0;
                }
                if (thisArea < otherArea) {
                    return -1;
                }
                return 1;
            }

            @Override
            public String toString() {
                return "This is " + getClass().getSimpleName() + ", color is: " + shapeColor;
            }

            abstract double calcArea();
        }
}
