package aqa.core.lesson7.vriaboshapka;

public class Shape {
    private String shapeColor;
    String shapeName;

    public Shape(String shapeColor){
        this.shapeColor=shapeColor;
    }

    public Shape() {
    }

    @Override
    public String toString(){
        return  "This is Shape, color is:"+this.shapeColor;

    }
    public double calcArea(){
     double val;
     val=0.0;
     return val;


    }


}
