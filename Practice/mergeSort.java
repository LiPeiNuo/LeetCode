package Practice;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 90,2,45,62,45,2,34,51, 3, 6, 7};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left >= right || right -left ==1){
            return;
        }
            int mid = (left + right) / 2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid,right);
            merge(arr,left,mid,right);

    }

    public static void merge(int[] arr, int left, int mid, int right){
        int length = right -left;
        int[] temp = new int[length];
        int i = left;
        int j = mid ;
        int tempIndex = 0;
        while (i < mid && j < right){
            if(arr[i] <= arr[j]){
                temp[tempIndex++] = arr[i++];
            }else{
                temp[tempIndex++] = arr[j++];
            }
        }
        while (i < mid){
            temp[tempIndex++] = arr[i++];
        }
        while (j < right){
            temp[tempIndex++] = arr[j++];
        }
        for(int k = 0; k < length; k++){
             arr[left + k ] = temp[k];
         }
    }

}
