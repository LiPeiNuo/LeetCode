package YangHui;

import java.util.ArrayList;
import java.util.List;

/*
给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/pascals-triangle
*/

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        //杨辉三角形的特点：
        //1、第一行固定就是一个1
        //2、第二行也固定就是两个1
        //3、第i行，始终元素都是1
        //4、第i行有i个元素
        //5、对于第i行来说，第j列 的值为i-1行 的 j-1 + j 的值
        if(numRows < 1){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if(numRows ==1){
            return result;
        }
        List<Integer> senconLine = new ArrayList<>();
        senconLine.add(1);
        senconLine.add(1);
        result.add(senconLine);
        if(numRows ==2){
            return result;
        }


        //处理第i行
        //第i行有i列
        //（i，j）=（i-1，j-1） + （i-1，j）
        //第一个和最后一个元素都固定是1
        for(int row = 3; row <= numRows; row++){
            //如果想知道第row行情况，先知道row-1行的情况
            //第一次row-1 是为了得到row-1行
            //第二次 -1，是为了得到数组下标
            List<Integer> prevLine = result.get(row -1 -1);
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);
            //for相当于进行了row-2次
            for(int col = 2; col < row; col++){
                int curNum = prevLine.get(col -1 -1) + prevLine.get(col -1);
                curLine.add(curNum);
            }
            //最后处理最后一个1
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}
