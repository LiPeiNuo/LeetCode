package Sort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr ={9,4,6,5,2,9,7,4};
//        insertSort(arr);
//        shellSort(arr);
//        selectSort(arr);
//        heapSort(arr);
//        bubbleSort(arr);
//        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] array){
        int bound = 1;
        for ( ; bound < array.length; bound++){
            int tmp = array[bound];
            int cur = bound - 1;
            for( ; cur >= 0; cur--){
                if(array[cur] > tmp){
                    array[cur + 1] = array[cur];
                }else{
                    break;
                }
            }
            array[cur + 1] = tmp;
        }
    }


    public static void shellSort(int []array) {
        int gap = array.length;
        while (gap > 1) {
            gap /= 2;
        }
        insertSortGap(array,gap);
    }
    public static void insertSortGap(int[] array,int gap){
        int bound = 1;
        for(; bound < array.length; bound++){
            int tmp = array[bound];
            int cur = bound - gap;
            for(; cur >=0; cur--){
                if(array[cur] > tmp){
                    array[cur + gap] = array[cur];
                }else{
                    break;
                }
            }
            array[cur+gap] = tmp;
        }
    }

    public static void selectSort(int[]array){
        for(int bound = 0; bound < array.length; bound++){
            for(int cur = bound + 1; cur < array.length; cur++){
                int tmp = array[bound];
                if(array[cur] < tmp){
                    array[bound] = array[cur];
                    array[cur] = tmp;
                }
            }
        }
    }





    public static void heapSort(int[] array){
        creatHeap(array);
        for(int i = 0; i < array.length; i++){
            swap(array, array.length - i-1, 0);
            shiftDown(array,array.length -1 -i, 0);
        }
    }
    public static void creatHeap (int[] array){
        for(int i = (array.length-1-1)/2 ; i>=0; i--){
            shiftDown(array, array.length, i);
        }
    }
    public static void shiftDown(int[] array, int size, int index){
        int parent = index;
        int child = 2 * parent + 1;
        while(child < size){
            if(child + 1 < size && array[child + 1] > array[child]){
                child = child + 1;
            }
            if(array[parent] < array[child]){
                swap(array, child, parent);
            }else{
                break;
            }
            parent = child;
            child = 2 * parent +1;
        }
    }
    public static void swap(int[] array, int x, int y){
        int tmp = array[x];
         array[x] = array[y];
         array[y] = tmp;
    }



    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i +1 ; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }




    public static void quickSort(int[] array, int left, int right ){
        if(left < right){
            int i = left;
            int j = right;
            int baseValue = array[i];
            while ( i < j){
                while( i < j && array[j] > baseValue){
                    j--; // 从右向左找第一个小于baseValue的值
                }
                if(i<j){
                    array[i++] = array[j];
                }
                while (i < j && array[i] < baseValue){
                    i++;
                }
                if(i<j){
                    array[j--]=array[i];
                }
            }
            array[i] = baseValue;
            quickSort(array,left,i-1);
            quickSort(array,i+1,right);
        }
    }





}


