package Dome6;

public class Solution {
    public String toLowerCase(String str) {
        char[] list = str.toCharArray();
        for (int i = 0; i < list.length; i++) {
            int c = list[i];
            if(c>64&&c<97){
                list[i] = (char) (list[i]+32);
            }
        }
        return String.valueOf(list);
    }
}
