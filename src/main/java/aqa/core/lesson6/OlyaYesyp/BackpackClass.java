package aqa.core.lesson6.OlyaYesyp;

public class BackpackClass {
    private String color;
    private int height;
    private int width;

    public BackpackClass() {

    }

    public BackpackClass(String color, int height) {
        this.color = color;
        this.height = height;
    }

    public BackpackClass(String color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }
   public Integer getHeight () {return this.height;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BackpackClass back = (BackpackClass) o;
        return height == back.height;
    }

    @Override
    public int hashCode() {
        int result = color == null ? 0 : color.hashCode();
        result = 31 * result + height;
        result= 31* result+ width;
        return result;
    }

    @Override
    public String toString() {
        return "Backpack parameters: "
                + "height='" + height + '\''
                + ", width=" + width
                + ", color=" + color
                + '}';
//    public String getColor () {return color;}
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getHeight() {return height;}
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getWidth() {return width;}
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public void printBackpackClass() {
//        System.out.println("");
//    }
    }
}
