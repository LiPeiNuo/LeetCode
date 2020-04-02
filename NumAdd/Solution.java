package NumAdd;

import java.util.Scanner;


//对于给定的正整数 n，计算其十进制形式下所有位置数字之和，并计算其平方的各位数字之和。
//输入
//4
//12
//97
//39999
//输出
//4 7
//3 9
//16 22
//39 36
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //输入的数字
        int b = a*a; //平方
        System.out.print(add(a)); //a的各位数字之和
        System.out.print(" " + add(b)); //b的各位数字之和（a的平方）
    }

   public static int add(int a){
        int sum=0;
        for(;a != 0;){
            sum = sum + a % 10; //取模计算出各位数字，相加计算各位数字之后
           a = a/10;
        }
        return sum;
    }
}
