package main.java.aqa.core.lesson10.akylo.virakrychkovska;

public class MyException extends Task2 {
        private String errorMessage;
        public MyException(String message) {
            errorMessage = message;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public void myExceptionPrint () {
            System.out.println(getErrorMessage());
        }
    }

