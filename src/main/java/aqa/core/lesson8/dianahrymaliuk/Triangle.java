package aqa.core.lesson8.dianahrymaliuk;

public class Triangle extends Shape{
    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.getshapeColor = shapeColor;
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public String getshapeColor;
    private double a;
    private double b;
    private double c;

    public double calcArea;
    public double calcArea(){
        calcArea = this.a*0.5*this.b;;
        return this.calcArea;
    }
    @Override
    public String toString() {
        return "This is Triangle, color is: " + this.getshapeColor + ". a= " + this.a + ". b= " + this.b + ". c= " + this.c + ". Shape area is: " + this.calcArea();
    }

    @Override
    public void draw() {
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
