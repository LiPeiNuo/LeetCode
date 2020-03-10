package LCM;

import java.util.Scanner;
//两个数的最小公倍数
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        if(x2 > x1){
            int tmp = x1;
            x1 = x2;
            x2 = tmp;
        }
        for(int i = 1; i <=x2; i++){
            int num = x1 * i;
            if( num % x2  == 0){
                System.out.println(num);
                break;
            }
        }

    }
}
