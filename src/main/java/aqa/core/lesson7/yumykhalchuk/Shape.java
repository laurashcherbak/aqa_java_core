package main.java.aqa.core.lesson7.yumykhalchuk;

public class Shape {
    private String shapeColor;
    private String shapeName;
    private double area;
    private double sumArea;

    public Shape(){

    }
    public Shape(double sumArea){
        this.sumArea = sumArea;
    }

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public Shape(String shapeName, String shapeColor){
        this.shapeName = shapeName;
        this.shapeColor = shapeColor;

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getSumArea() {
        return sumArea;
    }

    public void setSumArea(double sumArea) {
        this.sumArea = sumArea;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
    public double calcArea(){
        return area;

    }

    @Override
    public String toString() {
        return "This is" + " " + shapeName +", color is:" + " " + shapeColor ;
    }
}
