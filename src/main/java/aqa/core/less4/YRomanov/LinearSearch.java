package aqa.core.less4.YRomanov;

public class LinearSearch {
    public static void main(String[] args) {
        int[] value = {5, 10, 15, 18, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 91, 95, 100};
        int searchedValue = 18;
        int pos = 0;
        boolean found = false;
        while (pos < value.length && !found) {
            if (value[pos] == searchedValue) {
                found = true;

            } else {
                pos++;
            }
            if (found) {
                System.out.println("You catch me:" + pos);
            } else {
                System.out.println("ha ha ha!)");
            }

        }
    }
}
