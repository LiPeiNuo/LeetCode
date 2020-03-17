package Minimum;
//给定数字0-9各若干个。可以以任意顺序排列这些数字，但必须全部使用。
// 目标是使得最后得到的数尽可能小（注意0不能做首位）。
// 例如：给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 1; i < 10; i++) {
            if (arr[i] != 0) {
                System.out.print(i);
                arr[i]--;
                break;
            }
        }
        while (arr[0] != 0) {
            System.out.print(0);
            arr[0]--;
        }
        for (int i = 1; i < 10; i++) {
            while (arr[i] != 0) {
                System.out.print(i);
                arr[i]--;
            }
        }
    }
}
