package aqa.core.lesson3.barabash;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

public class Hw3 {

    public static void main(String... args) throws IOException {
        int even = 0;
        do {
            System.out.println("iterations= " + even);
            even += 2;
        } while (even <= 20);

        String inp1;
        String sign;
        String inp2;
        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Number:");
            inp1 = br.readLine();
            System.out.println(inp1);
            if(inp1.equals("q")){
                break;
            }
            System.out.println("Enter Sign");
            sign = br.readLine();
            System.out.println(sign);

            System.out.println("Second number");
            inp2 = br.readLine();
            System.out.println(inp2);
            System.out.println(inp1+sign+inp2+"="+calculation(inp1,inp2,sign));
        } while (true);

    }

    public static int calculation (String num1,String num2, String sign){
        int a= Integer.parseInt(num1);
        int b= Integer.parseInt(num2);
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