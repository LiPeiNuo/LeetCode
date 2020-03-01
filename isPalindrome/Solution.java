package isPalindrome;
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if((c >= '0'&&c<='9') || (c>='a' && c<='z')){
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}