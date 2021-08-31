package aqa.core.lesson7.virakrychkovska;

class Circle extends Shape {
    private double circleRadius;
    private String circleColor;
    public Circle () {
        this.circleRadius = 22;
        this.circleColor = "GREEN";
    }
    @Override
    public double calcArea() {
        return Math.PI * circleRadius * circleRadius;
    }
    @Override
    public String toString() {
        return "This is Circle, color: "+this.circleColor+" radius="+this.circleRadius;
    }
    public static void main (String args[]){
        Circle firstCircle = new Circle();
        System.out.println(firstCircle.toString());

        Circle secondCircle = new Circle ();
        double shapeAreaC = secondCircle.calcArea();
        System.out.println("Shape area is: " +shapeAreaC);
    }
}
