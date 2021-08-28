package aqa.core.lesson8.akylo.sikyrynska;

import java.util.Comparator;

public class ShapeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Shape s1 = (Shape)o1;
        Shape s2 = (Shape)o2;
        return s1.getShapeColor().compareTo(s2.getShapeColor());
    }

}