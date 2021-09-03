package aqa.core.lesson10.lesson10elenabeymart;

public class MyException extends FirstException {

    private String msg;

    MyException(String msg) {
        super(msg);
        this.msg = msg;
    }
        public String print() {
            return msg;
        }
    }

