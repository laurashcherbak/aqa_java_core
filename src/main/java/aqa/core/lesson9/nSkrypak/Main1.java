package aqa.core.lesson9.nSkrypak;

public class Main1 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
//        char[] arr1 = myStr1.toCharArray();
//        char[] arr2 = myStr2.toCharArray();
//        for (char i : arr1) {
//            boolean unique = true;
//            for(char j : arr2) {
//                if(arr1[i] == arr2[j]) {
//                    break;
//                }
//            }
//            if(unique) {
//                System.out.println(arr1[i] + "");
//            }
//        }
        StringBuilder distinct = new StringBuilder();
        StringBuilder same = new StringBuilder();
        for(int i = 0; i < myStr1.length(); i++) {
            //getting characters by index
            char charStr1 = myStr1.charAt(i);
            for(int j = 0; j < myStr2.length(); j++) {
                char charStr2 = myStr2.charAt(j);
                if(charStr2 == charStr1) {
                    same.append(charStr1);
                }else if(charStr2 != charStr1){
                    distinct.append(charStr1);
                }
            }
        }
        System.out.println(same);
        System.out.println(distinct);
    }
}
