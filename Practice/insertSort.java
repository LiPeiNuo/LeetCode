package Practice;

import java.util.Arrays;

public class insertSort {
    public static void main(String[] args) {
        int[] arr = {5,2,8,3,9,4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j -1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
                else{
                    break;
                }
            }
        }
    }



}
