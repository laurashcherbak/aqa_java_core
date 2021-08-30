package aqa.core.lesson7.lesson7kapusniak;

public class Shape {

    private String shapeColor;
    private String shape1;




    public Shape(String shapeColor, String shape1) {
        this.shapeColor = shapeColor;
        this.shape1 = shape1;
    }



    public String getShapeColor() {
        return this.shapeColor;

    }

    public String getShape1() {
        return this.shape1;

    }

    @Override
    public String toString() {
        return "This is " + shape1 + "Color is " + shapeColor;
    }

    public double calcArea() {
        double result = 0.0;
        return result;
    }


}
