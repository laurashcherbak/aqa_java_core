package aqa.core.lesson7.vriaboshapka;

public class Rectangle extends Shape{
    private double width;
    private double height;
    static String shapeName="Rectangle";
    private String shapeColor;

    public Rectangle(String shapeColor,double width, double height){
        this.shapeColor=shapeColor;
        this.width=width;
        this.height=height;
    }
      @Override
    public double calcArea(){
        double val=width*height;
        return val;
    }
    @Override
   public String toString(){
          return "This is Rectangle , color is: " + this.shapeColor + " width: "+ this.width + " height: " + this.height;
    }
}
