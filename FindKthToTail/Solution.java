package FindKthToTail;

public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
        
    public ListNode FindKthToTail(ListNode head,int k) {
        int len = size(head);
        if( k >len || k <= 0 || head == null){
            return null;
        }
        int offset = len - k;
        ListNode cur = head;
        for(int i = 0; i < offset; i++){
            cur = cur.next;
        }
        return cur;
    }
    public int size(ListNode head){
        int size = 0;
        for(ListNode cur = head; cur != null; cur = cur.next){
            size++;
        }
        return size;
    }

}