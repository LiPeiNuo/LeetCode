package rightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> queueNode = new LinkedList<>();
        queueNode.add(root);
        while(!queueNode.isEmpty()) {
            int size = queueNode.size();
            for(int i = 0; i < size; i++) {
                TreeNode t = queueNode.poll();
                if(t.left != null) {
                    queueNode.add(t.left);
                }
                if(t.right != null) {

                    queueNode.add(t.right);
                }
                if(i == size - 1){
                    res.add(t.val);
                }
            }
        }
        return res;
    }
}

