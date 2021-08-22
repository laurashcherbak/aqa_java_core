package aqa.core.lesson3.YuliiaAvrakhova;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello human! This is calulator");
        System.out.println("Insert a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        float x = Float.parseFloat(str);
        System.out.println("Insert operator:");
        String op = br.readLine();

        while(!op.equals("q")){
            System.out.println("Insert a number:");
            float num = Float.parseFloat(br.readLine());

            if(op.equals("+")){
                x = x + num;
            } else if(op.equals("-")) {
                x = x - num;
            } else if(op.equals("*")){
                x = x * num;
            } else if (op.equals("/")){
                x = x / num;
            } else{
                System.out.println("Wrong operator");
                System.exit(0);
            }
            System.out.println("Result: " + x);
            System.out.println("Insert operator:");
            op = br.readLine();
        }
    }
}
