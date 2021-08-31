package aqa.core.lesson9.MykhailoOsadtsiv.Kata;
//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//Note: The function accepts an integer and returns an integer
//
//FUNDAMENTALSMATHEMATICSALGORITHMSNUMBERS
public class SquareDigit {
    public static void main(String[] args) {
        int n = 9119;
        SquareDigit sD1 = new SquareDigit();
        System.out.println(sD1.squareDigits(n));
    }
    public int squareDigits(int n) {
        //  Implement me
        if (n == 0) return 0;
        Integer a = n;
        String input = a.toString();
        String output = "";
        for (int i = 0; i < input.length(); i++){
          int y = input.charAt(i) - '0';
          y = y * y;
          output += y;
        }
        return Integer.parseInt(output);
    }
}
