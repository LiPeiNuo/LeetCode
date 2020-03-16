package Square;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0;
        for(int i = 1; i <= n; i++){
            System.out.print(s);
        }
        System.out.println();

        if( n % 2 == 0)  a = n / 2;
        else if( n % 2 == 1)  a = (n-1) / 2;


        for(int j = 2; j < a; j++){
            for(int i = 1; i <= n; i++){
                if( i == 1){
                    System.out.print(s);
                }else if( i > 1 && i <= n -1){
                    System.out.print(" ");
                }else if ( i == n){
                    System.out.print(s);
                    System.out.println();
                }

            }
        }


        for(int i = 1; i <= n; i++){
            System.out.print(s);
        }
    }
}
