package aqa.core.lesson7;

public class Triangle {
    public static class Triangle  {
        private double a;
        private double b;
        private double c;
        private String shapeColor;

        public Triangle (String shapeColor, double a, double b, double c) {
            this.shapeColor=shapeColor;
            this.a= a;
            this.b=b;
            this.c=c;
        }

        public Triangle() {
        }

        @Override
        public double calcArea (double triangleArea){
            double p=(a+b+c)/2;
            double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Shape area is: " + area);
            return area;
        }

        @Override
        public String toString (){
            return "This is Triangle, color is:" + shapeColor ;
        }
        public String getShapeColor (){return shapeColor;}

        public void setShapeColor(String shapeColor) {
            this.shapeColor = shapeColor;
        }

        public double getA() {
            return a;
        }
        public void setA (double a){
            System.out.println("Side a: "+ a);
            this.a=a;}
        public double getB() {
            return b;
        }
        public void setB (double b){
            System.out.println("Side b: "+ b);
            this.b=b;}
        public double getC() {
            return c;
        }
        public void setC (double c){
            System.out.println("Side c: "+ c);
            this.c=c;}
    }
}
