package main.java.aqa.core.lesson8.akylo.virakrychkovska;

public interface Drawable {
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("This is Rectangle, color: RED, width=11, height=22, area is: 242");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("This is Circle, color: GREEN, radius=10, area is: 314.15926");
    }
}
    class Triangle implements Drawable{
        public void draw(){
            System.out.println("This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825 ");
        }
}

class TestInterface{
    public static void main(String args[]){
        Drawable c=new Circle();
        c.draw();
        Drawable r=new Rectangle();
        r.draw();
        Drawable t=new Triangle();
        t.draw();
    }
}
