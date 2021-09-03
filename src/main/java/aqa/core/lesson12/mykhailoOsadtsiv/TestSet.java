package aqa.core.lesson12.mykhailoOsadtsiv;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> mySet1 = new HashSet<>();
        Set<Integer> mySet2 = new HashSet<>();
        mySet1.add(1);
        mySet1.add(3);
        mySet1.add(5);

        mySet2.add(1);
        mySet2.add(3);
        mySet2.add(6);

        System.out.println(getIntersection(mySet1, mySet2));
        System.out.println(getIncludeAremoveB(mySet1, mySet2));
        System.out.println(getDiversity(mySet1, mySet2));
        System.out.println(mySet1);
        System.out.println(mySet2);
    }
        public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.retainAll(set2);
        return set3;
        }

        public static Set<Integer> getIncludeAremoveB(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.removeAll(set2);
        return set3;
        }

        public static Set<Integer> getDiversity(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set4 = new HashSet<>();
        set4 = getIncludeAremoveB(set2, set1);
        set3 = getIncludeAremoveB(set1, set2);
        set3.addAll(set4);
        return set3;
        }

}
