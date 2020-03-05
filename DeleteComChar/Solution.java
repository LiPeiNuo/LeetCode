package DeleteComChar;
import java.util.Scanner;
import java.util.HashSet;

//，从第一字符串中删除第二个字符串中所有的字符。
// 例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.” 
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        HashSet<Character> set = new HashSet();
        for(int i = 0; i < b1.length; i++){
            set.add(b1[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a1.length; i++){
            if(!set.contains(a1[i])){
                sb.append(a1[i]);
            }
        }
        System.out.println (sb.toString());
    }
}