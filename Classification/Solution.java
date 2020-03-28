package Classification;

import java.util.Scanner;
//给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
//A1 = 能被5整除的数字中所有偶数的和；
//A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4…；
//A3 = 被5除后余2的数字的个数；
//A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
//A5 = 被5除后余4的数字中最大数字。
//输入：
//每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = {0,0,0,0,0};
        int flag = 1;
        int count = 0;
        for(int i = 0;i < n ; i ++){
            arr[i] = sc.nextInt();
            if(arr[i] % 5 == 0){
                res[0] += arr[i];
            }
            if(arr[i] % 5 == 1){
                res[1] += arr[i] * flag;
                flag = -flag;
            }
            if(arr[i] % 5 == 2){
                res[2]++;
            }
            if(arr[i] % 5 == 3){
                res[3] += arr[i];
                count++;
            }
            if(arr[i] % 5 == 4){
                if(arr[i] >res[4]) res[4] = arr[i];
            }

        }
        if(res[0] != 0){
            System.out.print(res[0]+ " ");
        }else{
            System.out.print("n" + " ");
        }
        if(res[1] != 0){
            System.out.print(res[1]+ " ");
        }else{
            System.out.print("n" + " ");
        }
        if(res[2] != 0){
            System.out.print(res[2]+ " ");
        }else{
            System.out.print("n" + " ");
        }
        if(res[3] != 0){
            System.out.print(res[3] / count + "." + (int) ((res[3] % count * 100 / count +5) / 10 ) + " ");
        }else{
            System.out.print("n" + " ");
        }
        if(res[4] != 0){
            System.out.print(res[4]);
        }else{
            System.out.print("n");
        }

    }
}
