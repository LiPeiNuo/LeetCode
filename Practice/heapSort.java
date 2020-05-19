package Practice;

import java.util.Arrays;

public class heapSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 90,2,45,62,45,2,34,51, 3, 6, 7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] arr){
        createHeap(arr);
        for(int i = 0; i <arr.length; i++){
            int temp = arr[0];
            arr[0] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
            shiftDown(arr,arr.length-i-1,0);
        }
    }

    public static void createHeap(int[] arr){
      for(int i = (arr.length -1 -1 ) / 2; i >=0; i--){
            shiftDown(arr,arr.length,i);
      }
    }

    public static void shiftDown(int[] arr, int size, int i){
        int parent = i;
        int child = 2*parent + 1;
        while (child < size){
            if(child +1 < size && arr[child] < arr[child+1]){
                child = child +1;
            }
            if(arr[child] > arr[parent]){
                int temp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = temp;
            }

            parent = child;
            child = parent + 1;
        }
    }

}
