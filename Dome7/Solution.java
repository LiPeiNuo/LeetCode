package Dome7;

public class Solution {
    //给定一个数组 nums 和一个值 val，
    // 原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length ==0){
            return 0;
        }
        int j =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    //给定一个排序数组和一个目标值，在数组中找到目标值，
    // 并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
