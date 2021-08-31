package aqa.core.lesson8.yuliiaavrakhova;

public class Triangle extends Shape implements Comparable<Triangle> {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String draw(){
        return "This is Triangle ,  color: " + super.getShapeColor()+
                ", side= "+a+", side= "+b+", side= "+c+", area is: "+calcArea();
    }
    @Override
    public double calcArea() {
        double p = ( a + b + c ) / 2;
        double sqrtS = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(sqrtS);
    }

    @Override
    public String toString() {
        return "This is Triangle," + " color:" +super.getShapeColor() +", a=" + a + ", b=" + b + ", c=" + c ;
    }

    @Override
    public int compareTo(Triangle o) {
        double difference  = this.calcArea() - o.calcArea();
        if (difference == 0){
            System.out.println("Triangle are equal.");
            return 0;
        }
        else if(difference < 0){
            System.out.println("Triangle first < Second.");
            return -1;
        }else {
            System.out.println("Triangle first > Second.");
            return 1;
        }
    }
}
