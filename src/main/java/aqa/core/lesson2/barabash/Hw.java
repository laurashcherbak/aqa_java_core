
public class HomeWork {
    //    1. Write a code that will print on the screen output: Hello human!
    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");

//    2. Create variables of different primitive types (byte, short, int, long, float, double, char, boolean)
        byte byte1;
        short short2;
        int int3;
        long long4;
        float floatf5;
        double double6;
        char char7;
        boolean boolean8;
        String string9;
//    3. Assign values to all of your variables
        byte1 = 126;
        short2 = 32766;
        int3 = 3;
        long4 = 999999999999999L;
        floatf5 = 22.99f;
        double6 = 46.098;
        char7 = 'B';
        boolean8 = false;
        string9 = "Rostyslav";

//    4. Print values of created variables
        System.out.println("byte1 = " + byte1);
        System.out.println("short2 = " + short2);
        System.out.println("int3 = " + int3);
        System.out.println("long4 = " + long4);
        System.out.println("floatf5 = " + floatf5);
        System.out.println("double6 = " + double6);
        System.out.println("char7 = " + char7);
        System.out.println("boolean8 = " + boolean8);
        System.out.println("string9 = " + string9);


//    5. Print sum of 2 digits
        int x = -5;
        int y = 10;

        System.out.println(x + y);

//    6. Write a program that reads from console integer value and write to console value that is 2 times more than input.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Integer: ");
        int input = Integer.parseInt(br.readLine());
        System.out.println("Value that is 2 times more than input = "+(input*2));

//    7. Create a program which calculates the expression 14/209 + 14 * (29-13² + 14/3) and displays the result on the screen.
      double first = (14./209 + 14);
      double second = (29-13*13 + 14./3);

      public static double programCalc(double x, double y){
          z = x*y;
          return z;
        }
        System.out.println(programCalc(first,second));

//    8. Calculate expression
        double third = (5 + 2*3*3);
        double fourth = (7.*4*4/(5 + 2*2));

        public static double programCalc2(double x, double y){
            z = x/y;
            return z;
        }
        System.out.println(programCalc2(third,fourth));

    }
}