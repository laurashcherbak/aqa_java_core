package aqa.core.lesson6.LauraShcherbak;

public class Tree {

    private int height;
    private int diameter;
    private int age;

    public Tree() {
        this.height = 0;
        this.diameter = 0;
        this.age = 0;
    }

    public Tree(int height) {
        this.height = height;
        this.diameter = 0;
        this.age = 0;
    }

    public Tree(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
        this.age = 0;
    }

    public Tree(int height, int diameter, int age) {
        this.height = height;
        this.diameter = diameter;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "This Tree has:\n1) height = " + height + " \n2) diameter = " + diameter + " \n3) age = " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o == null|| getClass()!= o.getClass()) {
            return false;
        }
        Tree tree = (Tree) o;
        if((height != tree.height) || (diameter != tree.diameter) || (age != tree.age)) {
            return false;
        }
        return true;

    }

    @Override
    public int hashCode() {
        int result = (int) (height ^ (height >>> 32));
        result = 31 * result + age;
        result = 30 * result + diameter;
        return result;
    }

}
