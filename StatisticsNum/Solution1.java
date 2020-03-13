package StatisticsNum;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [10];
        String s = sc.next();
        char[] ch = s.toCharArray();
        for(int i = 0; i <10; i++){
            for(int j = 0; j < ch.length; j++){
                if((ch[j] - '0') == i ){
                    arr[i]++;
                }
            }
            if(arr[i]!=0) {
                System.out.println(i + ":" + arr[i]);
            }
        }
    }
}
