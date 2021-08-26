package lesson7elenabeymart;

public class Shape {
    private double height; //To hold height.
    private double width; //To hold width or base

    public Shape() {

    }

    //Set height and width
    public void setValues(double height, double width) {
        this.height = height;
        this.width = width;
    }
    //Get height
    public double getHeight() {
        return height;
    }
    //Get width
    public double getWidth() {
        return width;
    }
    private String color;
    public Shape (String color) {
         this.color = color;
    }
    public String toString() {
        return color;
    }
    public static void main(String[] args) {
        Color color = new Color("Red");

    }

    private static class Color {
        public Color(String red) {
        }
    }
}
