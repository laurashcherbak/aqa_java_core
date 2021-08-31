package aqa.core.lesson8.KostiantynStavruk;

import java.util.Comparator;

public class ComparatorAll implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Shape sh_1 = (Shape)o1;
            Shape sh_2 = (Shape)o2;
            return sh_1.getShapeColor().compareTo(sh_2.getShapeColor());
        }

    }
