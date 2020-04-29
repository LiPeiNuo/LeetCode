package PreciousStone;
import java.util.HashSet;
import java.util.Set;

/*
Leetcode771:石头与宝石
给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
S中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
J中的字母不重复，J和S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

示例 1:
输入: J = "aA", S = "aAAbbbb"
输出: 3

示例 2:
输入: J = "z", S = "ZZ"
输出: 0
*/

public class Solution {
    public static void main(String[] args) {
        String J = "ABcdefa";
        String  S = "Acfaopewvfnscs";
        System.out.println(numJewelsInStones1(J,S));
    }

    public static int numJewelsInStones(String J, String S) {
        int ans = 0;
        for (char s: S.toCharArray()) {
            for (char j : J.toCharArray()) {
                if (j == s) {
                    ans++;
                }
            }
        }
        return ans;
    }


    public static int numJewelsInStones1(String J, String S) {
        int ret = 0;
        Set jset = new HashSet();
        for(char j : J.toCharArray()){
            jset.add(j);
        }
        for(char s : S.toCharArray()){
            if(jset.contains(s)){
                ret++;
            }
        }
        return ret;
    }

}
