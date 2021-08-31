package aqa.core.lesson8.vriaboshapka;

public abstract class Shape implements Drawable {
    public String shapeColor;
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
    public abstract double calcArea();


    @Override
    public void draw() {

    }
}
