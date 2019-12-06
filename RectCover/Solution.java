package RectCover;
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
//请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
public class Solution {
    //非递归
    public int RectCover(int target) {
        if(target<=2){
            return target;
        }
        int a = 1;
        int b = 2;
        for(int i = 2; i < target; ++i){
            int cur = a + b;
            a = b;
            b = cur;
        }
        return b;
    }

    //递归
    public int RectCover2(int target){
        if(target <= 2){
            return target;
        }else{
            return RectCover2(target -1)+RectCover2(target -2);
        }
    }

}