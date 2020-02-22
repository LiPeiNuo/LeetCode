package selectSort;

public class Solution {
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
}

