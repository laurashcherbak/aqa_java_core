package aqa.core.lesson9.MykhailoOsadtsiv.Exceptions;

import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner sc = new Scanner(System.in);
        while (true) {
           int x = Integer.parseInt(sc.nextLine());
           if (x != 0) {
               throw new ScannerException("User input something different from 0");
           }


        }
    }
}
