package aqa.core.lesson5.VlasiukOksana;
import java.util.HashMap;
public class vlasiuk1 {

//    /**
//     * Implement the method that returns array of unique elements of input array (filter duplicate elements)
//     * <p>
//     * Examples:
//     * input array - [1, 2, 5, 2, 4]
//     * output array - [1, 2, 5, 4]
//     * <p>
//     * input array - [2, 3, 2, 3]
//     * output array - [2, 3]
//     *
//     * @param arr - array with elements
//     * @return - array with elements that don't have duplicates
//     */

    public static void main(String args[])
    {
        //create an integer array having some duplicate elements
        int arrayWithDuplicates[] = {1, 2, 5, 2, 4};

        //create a hashmap having integer type of key-value
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();

        //use for loop to pull the elements of array to hashmap's key
        for (int j = 0; j < arrayWithDuplicates.length; j++) {
            hashmap.put(arrayWithDuplicates[j], j);
        }
        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method
        System.out.println(hashmap.keySet());



        //create an integer array having some duplicate elements
        int arrayWithDuplicates2[] = {2, 3, 2, 3};

        //create a hashmap having integer type of key-value
        HashMap<Integer,Integer> hashmap1 = new HashMap<Integer,Integer>();

        //use for loop to pull the elements of array to hashmap's key
        for (int j = 0; j < arrayWithDuplicates2.length; j++) {
            hashmap1.put(arrayWithDuplicates2[j], j);
        }
        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method
        System.out.println(hashmap1.keySet());
    }
}
