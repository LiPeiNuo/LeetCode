package Partition;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int v) {
            this. val = v;
        }
    }
    public ListNode partition(ListNode pHead, int x){
        if(pHead == null){
            return null;
        }
        if(pHead.next == null){
            return pHead;
        }
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;
        ListNode bigHead = new ListNode(-1);
        ListNode bigTail = bigHead;
        for(ListNode cur = pHead; cur!= null; cur = cur.next){
            if(cur.val < x){
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;
            }else{
                bigTail.next = new ListNode(cur.val);
                bigTail = bigTail.next;
            }
        }
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}
