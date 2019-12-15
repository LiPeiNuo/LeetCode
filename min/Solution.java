package min;
import java.util.Stack;
public class Solution {
    Stack<Integer> stack=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        int p=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min=Integer.MAX_VALUE;
        while(stack.isEmpty()!=true){
            int node=stack.pop();
            if(node<min){
                min=node;
            }
            stack2.push(node);
        }
        while(stack2.isEmpty()!=true){
            stack.push(stack2.pop());
        }
        return min;
    }
}
