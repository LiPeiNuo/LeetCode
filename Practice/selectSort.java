package Practice;

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 90,2,45,62,45,2,34,51, 3, 6, 7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int cur = arr[i];
                if(cur > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = cur;
                }
            }
        }
    }
}
