package aqa.core.lesson5.alun;
//unique elements
import java.util.ArrayList;
public class hw51 {
    public static void main(String[] args) {
        ArrayList<Integer> el = new ArrayList<Integer>();
        el.add(1);
        el.add(2);
        el.add(5);
        el.add(2);
        el.add(4);
        System.out.println("Duplicates present "+el);

        Object[] item = el.toArray();
        for (Object i : item) {
            if (el.indexOf(i) != el.lastIndexOf(i)) {
                el.remove(el.lastIndexOf(i));
            }
        }
        System.out.println("Duplicates absent "+el);


        ArrayList<Integer> elem = new ArrayList<Integer>();
        elem.add(2);
        elem.add(3);
        elem.add(2);
        elem.add(3);
        System.out.println("Duplicates present "+elem);

        Object[] data = elem.toArray();
        for (Object y : data) {
            if (elem.indexOf(y) != elem.lastIndexOf(y)) {
                elem.remove(elem.lastIndexOf(y));
            }
        }
        System.out.println("Duplicates absent "+elem);
    }
}