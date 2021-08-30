package aqa.core.lesson7.nsobol7;

public class Circle {
        private double radius;
        private String shapeColor;

        public Circle (String shapeColor, double radius) {
            this.shapeColor=shapeColor;
            this.radius= radius;
        }

        public Circle() {
        }

        @Override
        public  double calcArea (double radius) {
            double area = Math.PI * radius * radius;
            System.out.println("Shape area is: " + area);
            return area;
        }

        @Override
        public String toString (){
            return "This is Circle, color is:" + shapeColor ;
        }
        public String getShapeColor (){return shapeColor;}

        public void setShapeColor(String shapeColor) {
            this.shapeColor = shapeColor;
        }

        public double getRadius() {
            return radius;
        }
        public void setRadius (double radius){
            System.out.println("Radius: "+ radius);
            this.radius=radius;}
}
