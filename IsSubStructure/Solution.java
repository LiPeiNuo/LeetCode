package IsSubStructure;

import java.util.Stack;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) return false;
        if (A == null) return false;
        return isMatch(A, B) ;
    }
    public boolean isMatch(TreeNode subA, TreeNode B) {
        if (subA == null) return false;
        if (subA.val == B.val) {
            boolean res = true;
            if (B.left != null) {
                res = res && isMatch(subA.left, B.left);
            }
            if (B.right != null) {
                res = res && isMatch(subA.right, B.right);
            }
            if (res) return true;
        }
        return false;
    }
}
