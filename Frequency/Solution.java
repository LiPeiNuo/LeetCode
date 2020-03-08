package Frequency;

import java.util.Scanner;

//标题：n个数里出现次数大于等于n/2的数
// 示例1: 输入 393256732333 输出 3

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] arr = new int[strs.length];
            for(int i = 0; i < strs.length;i++){
                arr[i] = Integer.valueOf(strs[i]);
            }

            int count = 0;
            int num = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(num == arr[i]){
                    count++;
                }else if(count > 0){
                    count--;
                }else{
                    num = arr[i];
                }
            }
            System.out.println(num);
        }
    }
}

