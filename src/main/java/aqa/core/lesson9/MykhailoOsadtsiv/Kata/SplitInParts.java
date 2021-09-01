package aqa.core.lesson9.MykhailoOsadtsiv.Kata;
//The aim of this kata is to split a given string into different strings of equal size (note size of strings is passed to the method)
//
//Example:
//
//Split the below string into other strings of size #3
//
//'supercalifragilisticexpialidocious'
//
//Will return a new string
//'sup erc ali fra gil ist ice xpi ali doc iou s'
//Assumptions:
//
//String length is always greater than 0
//String has no spaces
//Size is always positive
//FUNDAMENTALSSTRINGS
public class SplitInParts {
    public static void main(String[] args) {
        System.out.println(splitInParts("asdasfdfgasdgsdgsdf", 3));
    }

    public static String splitInParts(String s, int partLength) {
        // your code
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i= i+partLength) {
            if (i+partLength < s.length()) {
                sb.append(s.substring(i, i + partLength));
                sb.append(' ');
            } else {
                sb.append(s.substring(i));
            }
        }
        String output = sb.toString();
        return output;

    }
}
