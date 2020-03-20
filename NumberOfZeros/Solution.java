package NumberOfZeros;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            count+=num/5;
            num/=5;
        }
        System.out.println(count);
    }
}
