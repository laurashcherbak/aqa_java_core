package aqa.core.lesson8.lpylypenko;

import java.util.Comparator;

public class SortByColor implements Comparator<Shape> {
    // Used for sorting in ascending order of color
    public int compare(Shape s1, Shape s2)
    {
        return s1.shapeColor.compareTo(s2.shapeColor);
    }
}