package aqa.core.lesson10.mykhailo_osadtsiv;

public class MyException extends Exception {
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
