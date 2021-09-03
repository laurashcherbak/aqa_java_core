package aqa.core.lesson10.irynaKrechetova.part1;

public class myExeption extends Exception {

    private String s;

    public myExeption(String s) {
        this.s = s;
    }

    public void printMessage() {
        System.out.println(this.s);
    }

}
