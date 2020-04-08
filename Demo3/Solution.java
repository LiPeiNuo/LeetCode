package Dome3;

public class Solution {
    public int StrToInt(String str) {
        if (str.length() == 0 || "".equals(str)) {
            return 0;
        }
        boolean isNeg = false;
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        } else if (str.charAt(0) == '-') {
            isNeg = true;
            str = str.substring(1);
        }
        char[] s = str.toCharArray();
        double res = 0;
        for (int i = 0; i < s.length; i++) {
            if (!Character.isDigit(s[i])) {
                return 0;
            } else {
                res += Math.pow(10, s.length - i - 1) * (s[i] - 48);
            }
        }
        if(isNeg==false) {
            if(res>Integer.MAX_VALUE) {
                return 0;
            }else {
                return (int)res;
            }
        }else {
            if((0-res)<Integer.MIN_VALUE) {
                return 0;
            }else {
                return (int)(0-res);
            }
        }
    }
}