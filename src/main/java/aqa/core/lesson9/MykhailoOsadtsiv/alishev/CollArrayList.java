package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollArrayList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i + 100);
        }
    //1    System.out.println(list1);

    //2    System.out.println(list1.get(0));
    //2    System.out.println(list1.get(99));

    //3    System.out.println(list1.size());

//4        for (int i = 0; i < list1.size(); i++) {
//4            System.out.println(list1.get(i));
//4        }

        list1.remove(5);
        for (Integer x: list1)
            System.out.println(x);

        //6 + liamda operator

        //багато видалень - переопреділили в лінкедліст

        list1 = new LinkedList<>(list1);
        System.out.println(list1);

        list1.remove(1);
        list1.remove(3);
        System.out.println(list1);
    }
}
