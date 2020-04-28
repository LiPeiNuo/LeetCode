package FindNumsAppearOnce;
import java.util.Arrays;
import java.util.Scanner;


/*数组中值出现了奇数次的两个数字
给定一个数字arr，其中只有有两个数字出现了奇数次，其它数字都出现了偶数次，按照从小到大顺序输出这两个数。
输入描述:
输入包含两行，第一行一个整数n(1 \leq n \leq 10^5)(1≤n≤10 5)，代表数组arr的长度，第二行n个整数，代表数组arr,arr[i]为32位整数。
输出描述:
输出出现奇数次的两个数，按照从小到大的顺序。
示例1:
输入
4
1 1 2 3
输出
2 3
示例2:
输入
6
11 22 11 23 23 45
输出
22 45
*/


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        AppearOddNums(arr,length);
    }

    /*
     * 思路：
     * 先将数组进行排序，再将数组前一个元素与后一个比较进行比较
     * 如果相等则++count ， 直至不相等时 count%2=1
     * 对应arr[i]为出现奇数次的数字
     * 注意数组最后一个元素
     * */
    public static void AppearOddNums(int [] arr, int length){
        Arrays.sort(arr);
        int count = 1;
        int i = 0 ;
        for ( ; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count % 2 == 1) {
                    System.out.print(arr[i] + " ");
                }
                count = 1;
            }
        }
        if (arr[length-2] != arr[length-1]) {
            System.out.print(arr[length-1]);
        }
    }


}
