package ExchangeNum;

//编写一个函数，函数内不使用任何临时变量，直接交换两个数的值
//思路： 设M，N是常数，且a=M，b=N，则交换使用异或运算交换a和b的过程如下：
// a = a^b=M^N; b = a^b = M^N^N = M^0 = M;
//b交换成功 a = a^b = M^N^M = M^M^N = 0^N = N;
// a交换成功
public class Solution {
     public int[] exchangeAB(int[] AB) {
         AB[0] ^= AB[1];
         AB[1] ^= AB[0];
         AB[0] ^= AB[1];
         return AB;
     }
}
