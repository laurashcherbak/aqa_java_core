package aqa.core.lesson8.yliiagnatuik;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.getShapeColor() == null && o2.getShapeColor() == null) {
            return 0;
        } else if (o1.getShapeColor() == null) {
            return -1;
        } else if (o2.getShapeColor() == null) {
            return 1;
        } else {
            return o1.getShapeColor().compareTo(o2.getShapeColor());
        }
    }
}
