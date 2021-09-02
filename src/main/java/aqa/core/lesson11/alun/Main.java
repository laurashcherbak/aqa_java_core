package aqa.core.lesson11.alun;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        String inputLine = "";
        char action = ' ';

        Company com = new Company ("KyLoGic", "Kylo city, A.Kylo ave, 1", 777);

        Workers w1 = new  Workers ("Kylo1",111111111,111111);
        Workers w2 = new  Workers ("Kylo2",222222222,222222);
        Workers w3 = new  Workers ("Kylo3",333333333,333333);
        Workers w4 = new  Workers ("Kylo4",444444444,444444);
        Workers w5 = new  Workers ("Kylo5",555555555,555555);

        System.out.println(com.toString()+"\n");

        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
        System.out.println(w4.toString());
        System.out.println(w5.toString()+"\n");

        Workers [] w = {w1, w2, w3, w4, w5};
        for(int i = 0; i<w.length; i++ ) {
            System.out.println((w[i])); //тут я хотів з масивом побавитись
        }
        System.out.println("\n"+Arrays.toString(w));//тут я також хотів з масивом побавитись
        // і ще цікаво що треба додати власне сюди System.out.println("\n"+Arrays.toString(w)+"\n")
        // щоб друкануло кожен елемент з нового рядка...
        int maxFee = 0; String name = "";
        for(int i = 0; i<w.length; i++ ) {
            if (maxFee<w[i].getFee()); {
                maxFee=w[i].getFee();
                name=w[i].getName();
            }
        }
        System.out.println("Worker "+name +" has max salary "+ maxFee+" EUR per hour :)");
        int fee = 0; double taxAndFee = 0, total=0;
        for(int i = 0; i<w.length; i++ ) {
            fee = w[i].getFee();
            taxAndFee = w[i].getFee()*1.22;
            total += taxAndFee;
        }
        System.out.println("Company's total salary costs = "+total +" EUR");
        double totalFee=0, avgFee=0;
        for(int i = 0; i<w.length; i++ ) {
            totalFee += w[i].getFee();
            avgFee = totalFee/(i+1);
        }
        System.out.println("Average total salary = "+avgFee +" EUR");

        Scanner input = new Scanner(System.in);
        System.out.println("Add data");
        System.out.println("Enter array of Workers length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array Workers data");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Inserted array Workers data:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }
}
