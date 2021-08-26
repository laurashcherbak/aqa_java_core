package aqa.core.lesson6.MarkiyanBednarchuk;

public class HomeWork6 {
    public static void main(String[] args) {
    Pen ballPen = new BallPen("ball pen", 1000, "black");
    System.out.println(ballPen);
    System.out.println("Number of uses:" + ballPen.getNumberOfUses());
    System.out.println("Pen type:" + ballPen.getType());
    System.out.println(ballPen.hashCode());
    Pen ballPen1 = new BallPen("ball pen", 1000, "black");
    System.out.println(ballPen1.hashCode());
    }
}
