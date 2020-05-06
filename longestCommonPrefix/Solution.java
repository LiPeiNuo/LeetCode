package longestCommonPrefix;

/*编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

示例 1:
输入: ["flower","flow","flight"]
输出: "fl"

示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。

*/
public class Solution {
    public static void main(String[] args) {
        String[] strs ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix_1(strs));
    }

    public static String longestCommonPrefix_1(String[] strs) {
        if(strs.length == 0 ){
            return "";
        }
        String ans = strs[0];
        for(int i = 1; i < strs.length; i++){
            int j = 0;
            for( ; j < ans.length() && j < strs[i].length(); j++){
                if(ans.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            if(ans.equals("")){
                return "";
            }
            ans = ans.substring(0,j);
        }
        return ans;
    }
}
