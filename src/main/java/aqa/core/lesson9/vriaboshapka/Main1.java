package aqa.core.lesson9.vriaboshapka;

public class Main1 {
    public static void main(String[]arg){
        String myStr1="Cartoon";
        String myStr2="Tomcat";
        StringBuilder result=new StringBuilder();
        for(int i=0; i<myStr1.length();i++ ){
            for (int j=0;j<myStr2.length();j++){
                if( myStr1.charAt(i)== myStr2.charAt(j)){
                    break;
                }
                if(myStr2.length()-1==j){
                  result.append(myStr1.charAt(i));
                }

            }
        }

        for(int i=0; i<myStr2.length();i++ ){
            for (int j=0;j<myStr1.length();j++){
                if( myStr2.charAt(i)== myStr1.charAt(j)){
                    break;
                }
                if(myStr1.length()-1==j){
                    result.append(myStr2.charAt(i));
                }

            }
        }
        System.out.println(result);
    }
}
