package aqa.core.lesson8.yuliiaavrakhova;

public class Rectangle extends aqa.core.lesson8.yuliiaavrakhova.Shape implements Comparable<Rectangle> {
private double width;
private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }
    public String draw(){
        return "This is Rectangle ,  color: " + super.getShapeColor()+
                ", width= "+width+", height= "+height+", area is: "+calcArea();
    }
    @Override
    public int compareTo(Rectangle o){
        double difference  = this.calcArea() - o.calcArea();
        if (difference == 0){
            System.out.println("Rectangle are equal.");
            return 0;
        }
        else if(difference < 0){
            System.out.println("Rectangle first < Second.");
            return -1;
        }else {
            System.out.println("Rectangle first > Second.");
            return 1;
        }
    }
    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "This is Rectangle "+", color:"+ super.getShapeColor()+
                ", width=" + width +
                ", height=" + height
                ;

    }
}
