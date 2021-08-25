package aqa.core.lesson4.vchorna;

public class Homework4 {

    static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int middleValue = array[middle];

            if (middleValue < value) {
                left = middle + 1;
            } else if (middleValue > value) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {
                464, 314, 472, 327, 717, 923, 16, 336, 147, 605, 953, 888, 377, 765, 807, 137, 477, 136, 545, 925, 770,
                582, 732, 264, 221, 691, 759, 541, 677, 849, 790, 963, 363, 174, 974, 750, 517, 441, 987, 86, 101, 77,
                181, 512, 965, 312, 60, 630, 821, 436, 646, 847, 885, 51, 369, 754, 322, 222, 1000, 959, 429, 195, 896,
                90, 978, 404, 714, 861, 63, 494, 115, 12, 532, 42, 872, 662, 340, 431, 72, 552, 318, 66, 968, 17, 270,
                843, 197, 782, 647, 731, 507, 574, 233, 187, 551, 430, 118, 848, 858, 412
        };

        System.out.println(linearSearch(array, 336));

        int[] arraySorted = {
                12, 16, 17, 42, 51, 60, 63, 66, 72, 77, 86, 90, 101, 115, 118, 136, 137, 147, 174, 181, 187, 195, 197,
                221, 222, 233, 264, 270, 312, 314, 318, 322, 327, 336, 340, 363, 369, 377, 404, 412, 429, 430, 431, 436,
                441, 464, 472, 477, 494, 507, 512, 517, 532, 541, 545, 551, 552, 574, 582, 605, 630, 646, 647, 662, 677,
                691, 714, 717, 731, 732, 750, 754, 759, 765, 770, 782, 790, 807, 821, 843, 847, 848, 849, 858, 861, 872,
                885, 888, 896, 923, 925, 953, 959, 963, 965, 968, 974, 978, 987, 1000
        };

        System.out.println(binarySearch(arraySorted, 264));
    }

}
