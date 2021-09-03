package aqa.core.lesson10.heleshko;

    public class MyException extends Exception {
        private String homework;

        MyException(String homework) {
            this.homework = homework;
        }

        public String print() {
            return homework;
        }

        public void myExceptionPrint() {
        }
    }
