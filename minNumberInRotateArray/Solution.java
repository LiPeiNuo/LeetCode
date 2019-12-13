package minNumberInRotateArray;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0) return 0;
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        if(array[end] == array[start] || array[mid] == array[end] || array[mid] == array[start]){
            return findMin(array);
        }
        if(array[mid] > array[start] && array[mid] < array[end]){
            return array[0];
        }
        while(true){
            mid = (start + end) / 2;
            if(array[mid] > array[start]){
                start = mid;
            }else if(array[mid] < array[end]){
                end = mid;
            }
            if((start+1) == end) break;
        }
        return array[end];
    }

    public int findMin(int[] array){
        int result = Integer.MAX_VALUE;
        for(int i = 0; i <= array.length - 1; i++){
            result = Math.min(result, array[i]);
        }
        return result;
    }
}
