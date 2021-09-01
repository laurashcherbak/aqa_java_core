package aqa.core.lesson8.dianahrymaliuk;

public abstract class Shape implements Drawable, Comparable{
    private String shapeColor;

    public String getshapeColor() {
        return this.getshapeColor();
    }

    public double calcArea() {
        return 0;
    }

    public Shape (String shapeColor){
        this.shapeColor=shapeColor;
    }
    @Override
    public String toString() {
        return "This is Shape, color is: " + this.shapeColor;
    }

    public int compareTo(Object o1, Object o2) {
        Shape shape1 = (Shape)o1;
        Shape shape2 = (Shape)o2;
        return shape1.getshapeColor().compareTo(shape2.getshapeColor());
    }
}
