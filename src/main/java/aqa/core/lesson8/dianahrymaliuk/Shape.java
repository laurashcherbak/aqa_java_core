package aqa.core.lesson8.dianahrymaliuk;

public abstract class Shape implements Drawable, Comparable{
    private String shapeColor;

    public String getshapeColor() {
        return this.getshapeColor();
    }

    public abstract double calcArea();
//    {
//        return this.calcArea();
//    }

    public Shape (String shapeColor){
        this.shapeColor=shapeColor;
    }
    @Override
    public String toString() {
        return "This is Shape, color is: " + this.shapeColor;
    }

    public int compareTo(Object o) {
        Shape shape = (Shape)o;
        if(this.calcArea() > shape.calcArea()) {
            return 1;
        }
        if(this.calcArea() < shape.calcArea()) {
            return -1;
        }
        return 0;
    }
}
