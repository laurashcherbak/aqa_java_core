package aqa.core.lesson8.akylo.nSkrypak;
import java.util.Comparator;

abstract class Shape implements Drawable, Comparable{
        //fields. Instance variable
        private final String shapeColor;
        private final String shapeName;

        //constructor
        public Shape(String shapeColor, String shapeName) {
            this.shapeColor = shapeColor;
            this.shapeName = shapeName;
        }

        //Encapsulation
        public String getShapeColor() {
            return shapeColor;
        }
        public String getShapeName() {
            return shapeName;
        }

        @Override
        public String toString() {
            return "This is " + getShapeName() + " color is " + getShapeColor();
        }

        public abstract double calcArea();

        public int compareTo(Object o) {
            return 0;
        }
}
