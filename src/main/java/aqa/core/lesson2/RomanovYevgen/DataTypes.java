package aqa.core.lesson2.RomanovYevgen;


import java.io.IOException;



public class DataTypes {
    public static void main(String[] args) throws IOException {
        String my_name;
        byte var_byte;
        int var_int;
        char var_char;
        long var_long;
        double var_double;
        short var_short;
        float var_float;
        boolean var_boolean;


        //comment
        my_name = "Romanov";
        var_byte = 107;
        var_int = 267638291;
        var_double = 45.36;
        var_char = 'y';
        var_boolean = true;
        var_float = 21.765F;
        var_long = 12345678900L;
        var_short = 8768;


        // Displayed------------

        System.out.println("Value byte" + var_byte);
        System.out.println("Value char" + var_char);
        System.out.println("Value int" + var_int);
        System.out.println("Value float" + var_float);
        System.out.println("Value double" + var_double);
        System.out.println("Value boolean" + var_boolean);
        System.out.println("Value long" + var_long);
        System.out.println("Value short" + var_short);
        System.out.println("My name is" + my_name);


    }
}

