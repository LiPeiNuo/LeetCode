package MinStack;

/*
设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) —— 将元素 x 推入栈中。
pop() —— 删除栈顶的元素。
top() —— 获取栈顶元素。
getMin() —— 检索栈中的最小元素。
 

示例:

输入：
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

输出：
[null,null,null,null,-3,null,0,-2]

解释：
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
 
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/min-stack
*/

import java.util.Stack;

public class Solution {
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();
    public void push(int x){
        A.push(x);
        if(B.isEmpty()){
            B.push(x);
            return;
        }
        int min = B.peek();
        if(x < min){
            min = x;
        }
        B.push(min);
    }

    public Integer pop(){
        if(A.isEmpty()){
            return null;
        }
        //B 中出，A 与 B 同步，最小值可能会改变
        B.pop();
        return A.pop();
    }
    public Integer top(){
        if(A.isEmpty()){
            return null;
        }
        return A.peek();
    }

    public Integer getMin(){
        if(B.isEmpty()){
            return null;
        }
        return B.peek();

    }
}
