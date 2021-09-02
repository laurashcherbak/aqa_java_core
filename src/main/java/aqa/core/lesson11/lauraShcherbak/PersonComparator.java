package aqa.core.lesson11.lauraShcherbak;

import java.util.Comparator;

public class PersonComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person person1 = (Person)o1;
        Person person2 = (Person)o2;
        return person1.getName().compareTo(person2.getName());
    }

}
