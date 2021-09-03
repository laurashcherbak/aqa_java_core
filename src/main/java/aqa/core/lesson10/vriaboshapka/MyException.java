package aqa.core.lesson10.vriaboshapka;

public class MyException extends Exception {
  String myMes;
    MyException(String arg) {
      myMes=arg;
    }
    public String getMyMes(){
        return myMes;
    }
    public void setMyMes(String yes){
        this.myMes=yes;
    }
    public void printMyMes(){
        System.out.println(getMyMes());
    }

}
