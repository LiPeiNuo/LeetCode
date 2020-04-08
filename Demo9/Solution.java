package Dome9;

public class Solution {
    public boolean isPalindrome(int x) {
        int nums = x;
        if(x < 0 ){
            return false;
        }
        int temp = 0;
        while(x > 0){
            temp = temp * 10 + (x % 10);
            x /= 10;
        }
        return nums == temp ? true : false;
    }
}
