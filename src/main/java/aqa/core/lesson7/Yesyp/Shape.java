package aqa.core.lesson7.Yesyp;


public class Shape {
    private String shapeColor;
    public double area;

    public Shape() {
    }
public double calcArea (){
        return area ;
}

    public  double calcArea(double area) {
        System.out.println("Area: " + area);
        return area;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }


    @Override
    public String toString() {
        return "This is Shape, color is:" + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
