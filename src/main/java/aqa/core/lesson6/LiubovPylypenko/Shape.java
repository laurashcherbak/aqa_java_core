package aqa.core.lesson6.LiubovPylypenko;

public class Shape {
    private final String shapeName;
    public String color = "white"; // default color

    public Shape() {
        this("Default Shape");
    }
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public double area() {
        return 1.0;
    };

    public double perimeter() {
        return 1.0;
    };

    //inherited get/set methods
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Shape shape = (Shape) o;
        return (this.hashCode() == shape.hashCode());
    }

    @Override
    public int hashCode() {
        int result = (int) (shapeName.hashCode() ^ (shapeName.hashCode() >>> 32));
        result = 31 * result + color.hashCode() ;
        return result;
    }

    @Override
    public String toString() {  return this.shapeName; }
}
