package bottle;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();//空瓶子数
            int count = 0; //能喝到汽水瓶数
            if(n>0){
                while (n>1) {
                    count += n / 3;
                    n = n / 3 + n % 3;
                    if (n == 2) {
                        n++;
                    }
                }
                System.out.println(count);
            }
        }
        in.close();
    }
}
