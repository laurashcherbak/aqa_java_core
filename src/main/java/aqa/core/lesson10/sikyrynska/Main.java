package aqa.core.lesson10.sikyrynska;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Task #1");
        try { System.out.println("Entrance");
            throw new java.lang.Exception("Exception");
        }catch (java.lang.Exception Exception){
            System.out.println("Catch");
            System.out.println(Exception.getMessage());
        }finally { System.out.println("Finally"); }

        //System.out.println("Task #2");
        Test t = new Test();
        try { t.test();
        } catch (Exception e) {
            e.printStoredString();
        }try{ System.out.println("Printing new exception");
            throw new Exception("Testing this exception");
        }catch(Exception e){ System.out.println("Testing method");
        e.printStoredString();
        }
    }

}
