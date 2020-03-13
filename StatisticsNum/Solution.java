package StatisticsNum;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [10];
        String s = sc.next();
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            switch (ch[i]){
                case '0':arr[0]++;break;
                case '1':arr[1]++;break;
                case '2':arr[2]++;break;
                case '3':arr[3]++;break;
                case '4':arr[4]++;break;
                case '5':arr[5]++;break;
                case '6':arr[6]++;break;
                case '7':arr[7]++;break;
                case '8':arr[8]++;break;
                case '9':arr[9]++;break;
            }
        }
        for(int j = 0; j < ch.length; j++){
            if(arr[j] != 0){
                System.out.println(j+":"+arr[j]);
            }
        }
    }
}
