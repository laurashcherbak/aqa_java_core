package main.java.aqa.core.lesson8.vriaboshapka;

import java.util.Comparator;

public class ShapeColorComparator implements Comparator<Drawable> {

    @Override
    public int compare(Drawable o1, Drawable o2) {
       return o1.getColor().compareTo(o2.getColor());
    }
}

