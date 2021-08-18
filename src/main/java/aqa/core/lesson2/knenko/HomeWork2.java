package knenko;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.sqrt;



public class HomeWork2 {
    //task_1
    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");

        //task_2
        byte b1;
        short s2;
        int i3;
        long l4;
        float f5;
        double d6;
        char c7;
        boolean b8;
        String s9;
        //task_3
        b1 = 100;
        s2 = 0b10001;
        i3 = 0x3f;
        l4 = 222233334567L;
        f5 = 19.838F;
        d6 = 46.098;
        c7 = 'a';
        b8 = true;
        s9 = "Hello Human";

        //task_4
        System.out.println("b1 = " + b1);
        System.out.println("s2 = " + s2);
        System.out.println("i3 = " + i3);
        System.out.println("l4 = " + l4);
        System.out.println("f5 = " + f5);
        System.out.println("d6 = " + d6);
        System.out.println("c7 = " + c7);
        System.out.println("s9 = " + s9);


        //task_5
        int x = -5;
        int y = 10;

        System.out.println(x + y);

        //task_6

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer: ");
        int input = Integer.parseInt(br.readLine());
        System.out.println("Value that is 2 times more than input = "+(input*2));

        //task_7 - I understand that this is not the right solution, but for now -it will be so.
        System.out.println("14/209 + 14 * (29-13*13 + 14/3) = "+(14./209 + 14 * (29-13*13 + 14./3)));
        //task_8
        System.out.println("(5 + 2*3*3)/√(7*4*4/(5 + 2*2)) = "+((5 + 2*3*3)/sqrt(7.*4*4/(5 + 2*2))));

    }
}




