package quickSort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr ={9,4,6,5,2,9,7,4};
        Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] array, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int baseValue = array[i];
            while (i < j) {
                while (i < j && array[j] > baseValue) {
                    j--; // 从右向左找第一个小于baseValue的值
                }
                if (i < j) {
                    array[i++] = array[j];
                }
                while (i < j && array[i] < baseValue) {
                    i++;
                }
                if (i < j) {
                    array[j--] = array[i];
                }
            }
            array[i] = baseValue;
            Sort(array, left, i - 1);
            Sort(array, i + 1, right);
        }
    }
}


