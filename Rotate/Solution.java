package Rotate;

public class Solution {
    //旋转 k 次，每次将数组旋转 1 个元素
    //时间复杂度O（n*k） 空间复杂度O（1）
    public void rotate1(int[] nums, int k) {
        int temp,previous;
        for(int i = 0; i < k; i++){
            previous = nums[nums.length-1];
            for(int j = 0; j < nums.length; j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    //使用额外的数组，数组原本下标为i放置在（i+k）%nums.length的位置上
    //然后将新数组拷贝在原数组中
    //时间复杂度O（n）空间复杂度O（n）
    public void rotate2(int[] nums, int k) {
        int[] a = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
            a[(i+k)%nums.length] = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = a[i];
        }
    }
}