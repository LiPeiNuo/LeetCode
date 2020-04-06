package Res;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for(int i = arr.length -1; i >=0; i--){
            if(i !=0){
                System.out.print(arr[i] + " ");
            }else {
                System.out.println(arr[i]);
            }
        }
    }
}
