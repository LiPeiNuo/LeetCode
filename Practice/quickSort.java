package Practice;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,4,3,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    /*public static void quickSort(int[] arr, int left, int right ){
        if(left < right){
            int i = left;
            int j = right;
            int baseValue = arr[i];
            while ( i < j){
                // 从右向左找第一个小于baseValue的值
                while( i < j && arr[j] > baseValue){
                    j--;
                }
                //从左向右找第一个大于等于baseValue的值
                while (i < j && arr[i] <= baseValue){
                    i++;
                }
                //走到这块，i停下来了，j也停下来了。然后交换i和j位置的元素
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

            }
            //while循环结束，则i=j，交换baseValue和相遇位置的元素
            arr[left] = arr[i];
            arr[i] = baseValue;

            quickSort(arr,left,i-1);
            quickSort(arr,j+1,right);
        }
    }*/


 /*   public static void quickSort(int[] array, int left, int right ){
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
    }*/





    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int i = left;
            int j = right;
            int base = arr[i];
            while (i < j){
                while (i < j && arr[j] > base){
                    j--;
                }
                while (i < j && arr[i] <= base){
                    i++;
                }
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            arr[left] = arr[i];
            arr[i] = base;
            quickSort(arr,left,i-1);
            quickSort(arr,i+1,right);
        }
    }


}
