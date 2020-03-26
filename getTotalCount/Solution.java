package getTotalCount;

import java.util.Scanner;
//有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
//“兔子数列”，指的是这样一个数列：0、1、1、2、3、5、8、13、21、34、……在数学上，斐波纳契数列以如下被以递归的方法定义：F（0）=0，F（1）=1，F（n）=F(n-1)+F(n-2)（n≥2，n∈N*）。
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int month = sc.nextInt();
            int result = getTotalCount(month);
            System.out.println(result);
        }
    }

    private static int getTotalCount(int month) {
        int result = 0;
        if(month < 3){
            result = 1;
        }else {
            result = getTotalCount(month -1) + getTotalCount(month -2);
        }
        return result;
    }
}
