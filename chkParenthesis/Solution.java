package chkParenthesis;
import java.util.*;


//给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串对于一个字符串，
//  “( ( ) ( ) )”， 6      返回：true
//  “（）a（）（）”， 7     返回false
//  “（）（（）（）”， 7    返回false
//

class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        if(n%2==1){
            return false;
        }
        int left = 0;
        int right = 0;
        for(char ch : A.toCharArray()){
            if(ch == '('){
                left++;
            }
            if(ch == ')'){
                right++;
            }
        }
        if(right == left){
            return true;
        }
        return false;
    }
}