package aqa.core.lesson11;


import java.util.Arrays;
import java.util.Comparator;

class Ship {

    private int x = 10;

    public static void main(String[] args) {
        Ship ship1 = new Ship();
        ship1.doSomethin();
        String[] arr = {"java","se","course","one"};
        Arrays.sort(arr, new Comparator< String >() {
            @Override
            public int compare(String arg0, String arg1) {
                return arg0.length() - arg1.length();
            }
        });
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator< String >() {
            @Override
            public int compare(String arg0, String arg1) {
                return arg1.length() - arg0.length();
            }
        });
        System.out.println(Arrays.toString(arr));
        Ship ship = new Ship();
        ship.doJob();
        String some = "NORTH";
        if (some.equals(MyDirection.NORTH)){

        }

        if (MyDirection.NORTH.equals(MyDirection.valueOf(some))){
            System.out.println(MyDirection.NORTH);
        }
    }

    void doJob() {
        final int y = 20;
        MyTest tst = new MyTest() {
            public void test() {
                System.out.println(x + y);
            }
        };
        tst.test();
    }

    public enum MyDirection {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }


    public class O{

    }

    public void doSomethin(){

    }
}


