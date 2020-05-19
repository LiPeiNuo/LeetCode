package Practice;

import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 90,2,45,62,45,2,34,51, 3, 6, 7};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        for (int l = arr.length; l > 0; l /= 2) {
            for (int i = 0; i < arr.length; i ++) {
                for (int j = i; j >= l ; j -=l ) {
                    if (arr[j] < arr[j - l]) {
                        int tmp = arr[j];
                        arr[j] = arr[j - l];
                        arr[j - l] = tmp;
                    } else {
                        break;
                    }
                }
            }
        }

    }
}
