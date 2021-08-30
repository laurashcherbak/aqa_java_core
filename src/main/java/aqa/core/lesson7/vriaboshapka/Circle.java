package aqa.core.lesson7.vriaboshapka;

public class Circle extends Shape {
    private double radius;
    private String shapeColor;
    static String shapeName="Circle";

     Circle (double radius, String shapeColor){
        this. radius = radius;
        this.shapeColor=shapeColor;
    }

        @Override
        public String toString() {
            return "This is Circle, color is: "+ this.shapeColor + " radius: "+this.radius;

    }

    @Override
    public double calcArea() {
        double val = Math.PI * radius*2;
        return val;
    }

    }



