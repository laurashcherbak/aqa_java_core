package aqa.core.lesson10.akylo.virakrychkovska;

public class Task2 {
        public static void main(String[] args) {
            try {
                throw new Exception("GlobalLogic is a company");
            } catch (Exception e) {
                System.out.println("GlobalLogic is located in Lviv");
            } finally {
                System.out.println("GlobalLogic has the QA course");
            }
        System.out.println("Since July");
//        try {
//        throw new MyException("I'm a student of GlobalLogic");
//    } catch (MyException e) {
//        e.myExceptionPrint();
//    }
    }

}
