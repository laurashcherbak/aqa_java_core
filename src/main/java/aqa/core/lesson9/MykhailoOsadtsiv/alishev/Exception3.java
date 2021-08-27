package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

import java.io.IOException;
import java.text.ParseException;

public class Exception3 {
    public static void main(String[] args) {
        //Checked Exception (Compile time Exception) //опрацювати
        //Unchecked Exception (Runtime exception)  // видалити причину

        //int a = 1 / 0;

        //    String name = null;
        //    name.length();

      //  int[] arr = new int[2];
      //  System.out.println(arr[2]);
        try {
            run();
    //    } catch (IOException | ParseException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
