package Dome5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(cutRope(n));
    }
    private static int cutRope(int target) {
        int a = 0;
        int c = 0;
        int maxValue = 2;

        //输入参数范围验证
//        if (2 > target || 60 < target) {
//            return -1;
//        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        if (target % 3 == 0) {
            maxValue = (int)Math.pow(3, target / 3);
        } else{
            a = target - 2;
            c = a % 3;
            maxValue = maxValue * (int)Math.pow(3, a / 3);
            if (0 != c) {
                maxValue = maxValue * c;
            }
        }
        return maxValue;
    }
}

