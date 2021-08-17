package aqa.core.lesson2.akylo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInput {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // stream opening
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine()); // stream reading
        System.out.println(i);


    }

}
