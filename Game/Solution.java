package Game;

import java.util.Scanner;
//小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.
// 在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3…bn.
// 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,并且使得自己的能力值增加bi;
// 如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
//输入描述:
//对于每组数据,第一行是两个整数n(1≤n<100000)表示怪物的数量和a表示小易的初始能力值.
//第二行n个整数,b1,b2…bn(1≤bi≤n)表示每个怪物的防御力
//输出描述:
//对于每组数据,输出一行.每行仅包含一个整数,表示小易的最终能力值
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 坏蛋的数量
        int xiaoyi = sc.nextInt();//小易的初识能量
        int[] badegg = new int[count];
        for(int i = 0; i < count; i++){
            badegg[i] = sc.nextInt();
        }

        int count1 = sc.nextInt();
        int xiaoyi1 = sc.nextInt();
        int[] badegg1 = new int[count1];
        for(int i = 0; i < count1;i++ ){
            badegg1[i] = sc.nextInt();
        }

        int ret = finalEnergy(count,xiaoyi,badegg);
        int ret1 = finalEnergy(count1,xiaoyi1,badegg1);
        System.out.println(ret);
        System.out.println(ret1);
    }

    public static int finalEnergy(int count, int xiaoyi,int[] badegg){
        int tmp = xiaoyi;
        for(int i = 0; i < count; i++){
            if(tmp > badegg[i]){
                tmp+=badegg[i];
            }else{
                tmp+=CommonDivisor(tmp,badegg[i]);
            }
        }
        return tmp;
    }

    public static int CommonDivisor(int a, int b ) {
        int c = Math.min(a,b);
        int ret = 0;
        for(; c > 1; c--){
            if(a%c== 0 && b%c==0){
                break;
            }else{
                continue;
            }
        }
        return c ;
    }

}
