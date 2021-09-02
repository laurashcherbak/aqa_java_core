package aqa.core.lesson8.sikyrynska;

abstract class Shape implements Drawable, Comparable {
    private String sC;

    public Shape() {
        this.sC = " ";
    }

    public Shape(String sC) {
        this.sC = sC;
    }

    public String getShapeColor() {
        return sC;
    }

    public void setShapeColor(String sC) {
        this.sC = sC;
    }


    public abstract double calcArea();

    @Override
    public String toString() {
        return "This is shape, colour is " + sC;
    }

    @Override
    public void draw() {
        System.out.println(toString()+", area is "+ calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape s = (Shape)o;
        if(this.calcArea() < s.calcArea()) {
            return -1;
        }if(this.calcArea() > s.calcArea()) {
            return 1;
        }
        return 0;
    }



}