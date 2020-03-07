package differentkinds;

import java.util.Scanner;
//有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。
//John现在有n个想要得到的物品，每个物品的体积分别是a1，a2……an。
// John可以从这些物品中选择一些，如果选出的物体的总体积是40，那么利用这个神奇的口袋，John就可以得到这些物品
// 现在的问题是，John有多少种不同的选择物品的方式。

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(differentkinds(n-1, 40,arr));

    }
    public static int differentkinds(int n, int sum ,int arr[]){
        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(n == 0){
            return arr[0] == sum ?1:0;
        }else{
            return differentkinds(n-1,sum,arr) + differentkinds(n-1,sum-arr[n],arr);
        }
    }
}
