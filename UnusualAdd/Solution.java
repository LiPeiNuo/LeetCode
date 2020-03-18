package UnusualAdd;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        int n = 0;
        while (B!=0){
            sum = A^B;
            n = (A & B) << 1;
            A = sum;
            B = n;
        }
        System.out.println(sum);
    }
}
