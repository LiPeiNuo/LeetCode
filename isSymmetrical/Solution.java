package isSymmetrical;


public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    boolean isSymmetrical(TreeNode pRoot){
        TreeNode node = getMirror(pRoot);
        return isSymmetrical(pRoot,node);
    }
    boolean isSymmetrical(TreeNode pRoot,TreeNode node){
        if(pRoot == null && node == null){
            return true;
        }else if(pRoot == null || node  == null){
            return false;
        }
        if(pRoot.val == node.val){
            return isSymmetrical(pRoot.left,node.left)&&isSymmetrical(pRoot.right,node.right);
        }
        return false;
    }

    TreeNode getMirror(TreeNode pRoot){
        if (pRoot == null){
            return null;
        }
        TreeNode root = new TreeNode(pRoot.val);
        root.right = getMirror(pRoot.left);
        root.left = getMirror(pRoot.right);
        return root;
    }
}

