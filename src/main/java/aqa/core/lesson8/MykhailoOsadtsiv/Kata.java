package aqa.core.lesson8.MykhailoOsadtsiv;

public class Kata {
    public static String reverseWords(final String original)  // нам треба повернути стрічку де слова ідуть в правильному порядку, але літери у них задом наперед
    {
        // Have at it
        char[] ori = new char[original.length()];
        ori = original.toCharArray();
        int a = 0;
        String output = "";
        for (int b = a; b< ori.length; b = b + 1) {
            for (int i = b; i < ori.length; i++) {
                if (ori[i] == ' ') {
                    b = i;
                    break;
                }
                if (i == ori.length - 1) {
                    b = i + 1;
                    break;
                }
            }
            int c = b;
            for (c = c - 1; c >= a; c--) {
                output += ori[c];
            }
            if (b != ori.length) {
            output += ' ';
            a = b+1;
            }
        }


        return output;
    }  //-година
}
