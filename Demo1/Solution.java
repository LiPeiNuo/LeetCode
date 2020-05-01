package dome1;
//给你一个整数数组 nums，请你返回其中位数为 偶数的数字的个数。
//示例 1：
// 输入：nums = [12,345,2,6,7896]
// 输出：2
// 解释：
// 12 是 2 位数字（位数为偶数） 
// 345 是 3 位数字（位数为奇数）  
// 2 是 1 位数字（位数为奇数） 
// 6 是 1 位数字 位数为奇数） 
// 7896 是 4 位数字（位数为偶数）  
// 因此只有 12 和 7896 是位数为偶数的数字

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            int tmp = String.valueOf(num).length() % 2;
            if(tmp == 0) {
                count += 1;
            }else {
                count += 0;
            }
        }
        return count;
    }
    
    
    
    public int findNumbers1(int[] nums) {
        int count = 0;
        for(int num : nums) {
            int tmp = String.valueOf(num).length() % 2;
            if(tmp == 0) {
                count += 1;
            }else {
                count += 0;
            }
        }
        return count;
    }
}
