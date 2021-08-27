package lesson6ElenaBeymart;

import java.util.Scanner;
class Newspaper3 {
    private String name;
    private int date;
    Newspaper3(String name, int date) {
      this.name = name;
      this.date = date;
    }
    public static void main(String[] args) {
        Newspaper3 a = new Newspaper3("Click", 2017);
        Newspaper3 b = new Newspaper3("Click", 2017);
//Comparing the two objects
        boolean bool = a.equals(b);
        System.out.println(bool);
    }
    }

