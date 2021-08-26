package aqa.core.lesson8.yesyp;

public class Rectangle extends Shape implements Drawable{
    private double width;
    private double height;
    private String shapeColor;

    public Rectangle (String shapeColor, double width, double height) {
        this.shapeColor=shapeColor;
        this.width= width;
        this.height=height;
    }
    @Override
    public void draw (){area = width * height;
        System.out.println("Width:"+ width+System.lineSeparator()+ "Heidht:"+height+
                System.lineSeparator()+"Shape area is: " + area);}

    @Override
    public  double calcArea () {
        area = width * height;
        System.out.println("Shape area is: " + area);
        return area;
    }
//    public Rectangle() {
//    }

    @Override
    public String toString (){
        return "This is Rectangle, color is:" + shapeColor ;
    }
    public String getShapeColor (){return shapeColor;}

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth (double width){
        System.out.println("Width: "+ width);
        this.width=width;}


    public double getHeight() {
        return height;
    }
    public void setHeight (double height){
        System.out.println("Height: "+ height);
        this.height=height;}
}
