package aqa.core.lesson7.DianaHrymaliuk;

public class Rectangle extends Circle{
    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.height=height;
        this.width=width;
        this.getshapeColor = shapeColor;

    }
    private double width;
    private double height;


    public double calcArea(){
        calcArea = this.height*this.width;;
        return this.calcArea;
    }
    @Override
    public String toString() {
        return "This is Rectangle, color is: " + this.getshapeColor + ". width= " + this.width + ". height= " + this.height + ". Shape area is: " + this.calcArea();
    }
}
