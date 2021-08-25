package aqa.core.lesson7.LauraShcherbak;

public class Shape {
    private String shapeColor;
    //private String shapeName;

    public Shape() {
        this.shapeColor = " ";
        //this.shapeName = "Shape";
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
        //this.shapeName = "Shape";
    }

    public String getShapeColor() {
        return shapeColor;
    }

 //   public String getShapeName() {
 //       return shapeName;
 //   }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

//    public void setShapeName(String shapeName) {
//        this.shapeName = shapeName;
//    }

    public double calcArea() {
        return 0.0;
    }

    @Override
    public String toString() {
//        return "This is " + shapeName + ", colour is: " + shapeColor;
        return "This is Shape, colour is: " + shapeColor;
    }

}
