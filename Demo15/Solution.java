package Dome15;

class Solution {
    private long MIN = Long.MIN_VALUE;
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) throw new RuntimeException("nums is null or length of 0");
        int n = nums.length;
        int one = nums[0];
        long two = MIN;
        long three = MIN;
        for (int i = 1; i <  n; i++) {
            int now = nums[i];
            if (now == one || now == two || now == three) continue;
            if (now > one) {
                three = two;
                two = one;
                one = now;
            } else if (now > two) {
                three = two;
                two = now;
            } else if (now > three) {
                three = now;
            }
        }
        if (three == MIN) return one;
        return (int)three;
    }
}

