package aqa.core.lesson4.NazarVdovych;

public class HomeWork4 {
    //Лінійнийи пошук
  ///*
  public static void main(String[] args) {

        int[] arr = {4,10,4,5,8,7,6,1,8,6};
        int search = 8;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                System.out.print(i);
                break;
            }
            //System.out.print("Масив немає такого числа(");
           // break;
        }

    }
    //*/
    //Бінарний Пошук
    /*
    public static void main(String[] args) {
        int[] arr = {4,10,4,5,8,7,6,1,8,6};
        int search = 2;

        boolean toggle = true;
        int start = 0;
        int end = arr.length - 1;
        while (toggle) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                System.out.println(mid);
                toggle = false;
            } else {
                if(arr[mid] < search) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }

    }
*/
}
