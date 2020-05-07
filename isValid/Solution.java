package isValid;

/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true

*/

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "{[(]})";
        System.out.println(isValid_2(s));
    }

    public static boolean isValid_1(String s) {
        if(s.isEmpty()){
            return true;
        }
        Stack <Character>stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(stack.empty() || c!= stack.pop()){
                return false;
            }
        }
        return stack.empty();
    }


    public static boolean isValid_2(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if(stack.empty()){
                    return false;
                }
                char l = stack.pop();
                if(c == ')' && l != '(' ||c == ']' && l != '['  || c == '}' && l != '{' ){
                    return false;
                }
            }
        }

        return stack.empty();

    }
}
