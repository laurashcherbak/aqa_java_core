package aqa.core.lesson12.mykhailoOsadtsiv;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("BB", 2);
        hm.put("CCC", 3);
        hm.put("AA", 2);
        hm.put("AAA", 3);
        System.out.println(hm);
        String str = Integer.toString(hm.get("A"));
        System.out.println(str);

        Map<Integer, String> hm2 = new HashMap<>();
        hm2.put(1, "A");
        hm2.put(2, "BB");
        hm2.put(3, "CCC");
        hm2.put(2, "AA");
        hm2.put(3, "AAA");
        System.out.println(hm2);

        System.out.println(hm2.size());

        for(Map.Entry<Integer, String> item : hm2.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }



    }
}
