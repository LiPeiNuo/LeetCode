package NoneTwo;
import java.util.Scanner;

//二货小易有一个W*H的网格盒子，网格的行编号为0H-1，网格的列编号为0W-1。
// 每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
//对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
//( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
//小易想知道最多可以放多少块蛋糕在网格盒子里。
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[][] arr = new int[w][h];
        int count =0;
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                if(arr[i][j] != -1){
                    count++;
                }
                if(i + 2 < w){
                    arr[i+2][j]=-1;
                }
                if(j + 2 < h){
                    arr[i][j+2] = -1;
                }
            }
        }
        System.out.println(count);
    }
}
