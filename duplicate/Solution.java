package duplicate;

import java.util.*;
public class Solution {
    public boolean duplicate(int nums[],int length,int [] duplication) {
        if(nums == null || length == 0){
            return false;
        }
        for(int i=0;i<length;i++){
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    duplication[0] = nums[i];
                    return true;
                }
                // swap
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return false;
    }
}
