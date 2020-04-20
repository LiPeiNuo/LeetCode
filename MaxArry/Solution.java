package MaxArry;
import java.util.Scanner;

//标题：连续最大和
//        一个数组有 N 个元素，求连续子数组的最大和。
//        例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
//        输入描述： 输入为两行。 第一行一个整数n(1 <= n <= 100000)，表示一共有n个元素 第二行为n个数，每个元素,每个 整数都在32位int范围内。以空格分隔。
//        输出描述： 所有连续子数组中和最大的值。
//        输入 3 -1 2 1
//        输出 3

//思路：直接进行累加，与最大值比较，并不停地更替最大值

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i] = sc.nextInt();
            }
            int result = maxArry(num,n);
            System.out.println(result);
        }
    }
    public static int maxArry(int[] array,int len) {
        if(array == null || len <= 0) {
            return -1;
        }
//假设最大值为这个数字，这里有一个几千，这个数字正好是整形的最小值。
        int maxnum = 0x80000000;
        int sum = 0;
        for(int i = 0;i < len;i++) {
            if(sum <= 0) {
                sum = array[i];
            }else{
                sum += array[i];
            }
            if(sum > maxnum) {
                maxnum = sum;
            }
        }
        return maxnum;
    }
}
