package aqa.core.lesson3.vriaboshapka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework3 {
    public static void main(String... args) throws IOException {
        int even = 0;
        do {
            System.out.println("iterations= " + even);
            even += 2;
            } while (even <= 20);

         String input1;
         String sign;
         String input2;
        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // stream opening
            System.out.println("Enter Number or q:");
            input1 = br.readLine();
            System.out.println(input1);
           if(input1.equals("q")){
               break;
           }
            System.out.println("Enter Sign +,-,*,/");
            sign = br.readLine();
            System.out.println(sign);

            System.out.println("Enter Second number");
            input2 = br.readLine();
            System.out.println(input2);
            System.out.println(input1+sign+input2+"="+calculation(input1,input2,sign));
        } while (true);

    }

    public static int calculation (String number1,String number2, String sign){
        int a= Integer.parseInt(number1);
        int b= Integer.parseInt(number2);
        if (sign.equals("+")){
            return a+b;
        }
        if (sign.equals("-")){
            return a-b;
        }
        if (sign.equals("*")){
            return a*b;
        }
        if (sign.equals("/")){
            return a/b;
        }
        return 0;
    }
}
