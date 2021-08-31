package aqa.core.lesson9;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        char[]array=uniqueChars("Using methods of class String");
        System.out.println(Arrays.toString(array)); }

    public static char[] uniqueChars(String str) {
        char[] array=str.toCharArray();
        boolean[] d = new boolean[array.length];
        int m = 0;
        int n=0;
        char[]res;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if (x == y) {
                    break; }
                else if (array[x] == array[y]) {
                    d[x] = true;
                    d[y]=true;
                    m++;
                }
            }
        }
        res=new char[array.length-m];
        for(int i=0; i< array.length;i++){
            if(!d[i]){
                res[n]=array[i];
                n++;
            }
        }
        return res; }
}