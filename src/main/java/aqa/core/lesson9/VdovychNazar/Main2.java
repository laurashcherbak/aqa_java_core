package aqa.core.lesson9.VdovychNazar;

public class Main2 {
    public static void main(String[] args)
    {
        String myStr1 = new String("Cartoon");
        String myStr2 = new String("Tomcat");
        StringBuffer result = new StringBuffer();


        for(int k=0; k<myStr1.length();k++ ){
            for (int l=0;l<myStr2.length();l++){
                if( myStr1.charAt(k)== myStr2.charAt(l)){
                    break;
                } else if(myStr2.length()-1==l)
                {
                    result.append(myStr1.charAt(k));
                }
            }
        }for(int i=0; i<myStr2.length();i++ )
        {
        for (int j=0;j<myStr1.length();j++)
        {
            if( myStr2.charAt(i)== myStr1.charAt(j)){
                break;
            }else if(myStr1.length()-1==j)
            {
                result.append(myStr2.charAt(i)); }
        }
    }
        System.out.println(result);
    }
}

