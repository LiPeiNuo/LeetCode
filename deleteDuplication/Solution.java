package deleteDuplication;
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        if(pHead.next == null){
            return pHead;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = pHead;
        ListNode prev = newHead;
        ListNode node = prev.next;
        while(node!=null){
            if(node.next != null && node.val == node.next.val){
                while(node.next != null &&node.val == node.next.val){
                    node = node.next;
                }
                prev.next = node.next;
                node = node.next;
            }else{
                prev = prev.next;
                node = node.next;
            }
        }
        return newHead.next;
    }
}