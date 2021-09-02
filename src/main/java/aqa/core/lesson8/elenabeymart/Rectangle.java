package aqa.core.lesson8.elenabeymart;

public class Rectangle extends Shape {
    private static final String color = "Orange";
    private String Color;
    public double area;

    public Rectangle(String orange, int a, int a1) {
    }
    public double calcArea(double area) {
        System.out.println("Area : " + area);
        return area;
    }
        final String color1 = null;
        public Object Rectangle(String Color){
            this.Color = Color;
            return null;
        }
        @Override
        public String toString() {
            return "This is Shape, color is:" + Color;
        }
        public String getColor () {
            return Color;
        }
        public void setColor (String Color){
            this.Color = Color;
        }
        public double getArea () {
            return area;
        }
        public void setArea ( double area){
            this.area = area;
        }
        public void draw () {
        }
        public Rectangle(double width, double height) {
        super();
    }
    double calcArea() {
        return 0;
    }

    @Override
    public Object area() {
        return null;
    }
    public Object perimeter() {
        return null;
    }
}









