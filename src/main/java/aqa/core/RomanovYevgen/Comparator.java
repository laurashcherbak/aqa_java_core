package aqa.core.RomanovYevgen;

import java.util.Comparator;

public abstract class ShapeComparator implements Comparator {
    abstract int compare();
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape)o1;
        Shape shape2 = (Shape)o2;
        return shape1.getShapeColor().compareTo(shape2.getShapeColor());
    }
}

