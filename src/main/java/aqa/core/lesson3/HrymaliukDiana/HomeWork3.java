package aqa.core.lesson3.HrymaliukDiana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeWork3 {
    //    Номер в списку 29
    public static void main(String[] args) throws IOException {
//        for (int k = 1; k <= 20; k+=2 )
//            System.out.println(k);

        char i2;
        char q = ' ';
        while (q != 'q') {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the first number:");
            int i1 = Integer.parseInt(br.readLine());
            System.out.println("Enter the operator: + - * /");
            i2 = (br.readLine().charAt(0));
            System.out.println("Enter the second number:");
            int i3 = Integer.parseInt(br.readLine());

            if (i2 == '+') {
                double s = i1 + i3;
                System.out.print(s);
            } else if (i2 == '-') {
                double s = i1 - i3;
                System.out.print(s);
            } else if (i2 == '*') {
                double s = i1 * i3;
                System.out.print(s);
            } else if (i2 == '/') {
                double s = i1 / i3;
                System.out.print(s);
            }

            System.out.println("To exit enter 'q' ");
            q = (br.readLine().charAt(0));
        }

    }
}


