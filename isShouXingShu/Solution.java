package isShouXingShu;

import java.util.Scanner;

//守形数是这样一种整数，它的平方的低位部分等于它本身。
// 比如25的平方是625，低位部分是25，因此25是一个守形数。判断N是否为守形数。
//第一步：循环输入数据
// 第二步：数据求平方和，原数字和平方和数字转换字符串
// 第三步：截取平方数的低位，进行与原数字比较


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            isShouXingShu(scanner.nextInt());
        }
    }

    public static void isShouXingShu(int x) {
        int x2 = x * x;
        String s1 = String.valueOf(x); //原数字转String
        String s2 = String.valueOf(x2);//原数字平方转String        //平方数从低位截取，相当于字符串从末尾截取
        String s = s2.substring(s2.length() - s1.length(), s2.length());
        if (s.equals(s1)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

    }
}
