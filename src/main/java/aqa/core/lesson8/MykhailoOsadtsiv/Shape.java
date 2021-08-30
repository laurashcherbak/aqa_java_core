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

    public double calcArea() {
        return 1;
    }

    public int compare (Shape obj) {
        return (this.getShapeColor().compareTo(obj.getShapeColor()));
    }

    @Override
    public void draw() {
        System.out.println(this.toString() +
                ", area is : " + String.format("%.5f", this.calcArea()));
    }
}
