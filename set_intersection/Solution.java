package set_intersection;

import java.util.*;

/*
349.两个数组的交集

给定两个数组，编写一个函数来计算它们的交集。

示例 1:

输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2]
示例 2:

输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [9,4]
说明:

输出结果中的每个元素一定是唯一的。
我们可以不考虑输出结果的顺序。
通过次数71,202提交次数102,595

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
*/

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0;i < nums1.length;i++) {
            if(!set.contains(nums1[i])) {
                set.add(nums1[i]);
            }
        }
        for(int i = 0;i < nums2.length;i++) {
            if(set.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        Iterator<Integer> it = set2.iterator();
        while(it.hasNext()) {
            queue.offer(it.next());
        }
        int size = queue.size();
        int[] arr = new int[size];
        for(int i = 0;i < size;i++) {
            arr[i] = queue.poll();
        }
        return arr;
    }
}
