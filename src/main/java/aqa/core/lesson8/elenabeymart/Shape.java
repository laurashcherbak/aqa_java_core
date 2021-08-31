package aqa.core.lesson8.elenabeymart;

public class Shape {
        public Shape(String Color) {
        abstract class shape implements Drawable, Comparable<shape> {
            private final String Color;
            public shape(String Color) {
                this.Color = Color;
            }
        public void draw () {
            System.out.println(this + ", area is:" + calcArea());
        }
        @Override
        public int compareTo (shape other){
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
        public String toString () {
            return "This is" + getClass().getSimpleName() + " , color is : " + Color;
        }
        abstract double calcArea ();

            public abstract String area();

            public abstract double perimeter();
        }
            }

    public Shape() {

    }

    public Object area() {
        return null;
    }
}




