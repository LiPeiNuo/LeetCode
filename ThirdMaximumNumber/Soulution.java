package ThirdMaximumNumber;

import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> tree = new TreeSet();
        for(int i : nums){
            tree.add(i);
        }
        if(tree.size() < 3){
            return tree.last();
        }
        else{
            tree.remove(tree.last());
            tree.remove(tree.last());
            return tree.last();
        }
    }
}
