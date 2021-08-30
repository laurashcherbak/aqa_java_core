package aqa.core.lesson6.nsobol6;

import javax.xml.namespace.QName;

public class Homework6<Helmet> {
    public QName Helmet;
    public int size;
    public float hight;
    public float weight;
    public boolean isPredator;

//    public void Helmet() {
//        this.id = Homework6.index;
//        Homework6.index++;
//    }
//
//    public void Helmet (float hight, float weight, boolean isPredator) {
//        this.id = Homework6.index;
//        Homework6.index++;
//        this.weight = weight;
//        this.hight = hight;
//        this.isPredator = isPredator;
//
//    }

//    public int getSize() {
//        return id;
//    }

    public float getHight() {
        return hight;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setWeight(float weight) {
        this.weight +=1;
    }
//    public void Helmetname () {
//        System.out.println("Jack Pot" + getSize());
//    }

//    @Override
    public String toSring() {
        return "Helmet{" +
                "size=" + size +
                ", hight=" + hight +
                ", weight=" + weight +
                ", isPredator=" + isPredator +
                '}';
    }
//    @Override
//    public boolean equals(Object 0) {
//        boolean result;
//        if (!(0 != this)) {
//            result = true;
//        } else {
//            if (!(0 instranceof Helmet))result = false;,}
//        return result;
//    }
//            @Override
//    public int hashCode() {
//        return Object.hash(getSize(), getHight(), getWeight());
//            }

    public boolean getsize() {
        boolean b = false;
        return b;
    }
}


