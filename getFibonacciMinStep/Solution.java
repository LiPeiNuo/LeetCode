package getFibonacciMinStep;

import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.min;
public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(getStep(n));
    }
    public static int getStep(int n) {
        int num=0,x = 0;
        while (num>=0){
            if (Fibonacci(num)>=n){
                x=Fibonacci(num);
                break;
            }else {
                num++;
            }
        }
        int y=Fibonacci(num-1);
        return min(abs(y-n),abs(x-n));

    }
    public static int Fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return Fibonacci(n -1) + Fibonacci(n - 2);
        }
    }
}