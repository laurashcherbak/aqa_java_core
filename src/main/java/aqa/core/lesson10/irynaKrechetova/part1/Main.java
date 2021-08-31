package aqa.core.lesson10.irynaKrechetova.part1;

public class Main {

    public static void main(String[] args) {
        try {
            throw new Exception("fghhg");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("I was here");
        }

        try {
            throw new Exception("java = pain");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("second task");
        }

        try {
            myTest x = new myTest();
            x.test();
        }
        catch (myExeption e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("no pain, no gain");
        }


    }
}
