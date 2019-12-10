package insertionSortList;

public class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode frontier=new ListNode(0);
        frontier.next=head;
        ListNode pre=frontier;
        ListNode cur=head;
        ListNode insertNode=null;
        while(cur.next!=null){
            insertNode=cur.next;
            if(insertNode.val<pre.next.val){ //insert to the head
                cur.next=insertNode.next;
                insertNode.next=pre.next;
                pre.next=insertNode;
            }
            else if(insertNode.val>=cur.val){//insertNode value >= cur
                cur=cur.next;
            }
            else{//insertNode value < cur
                while(pre!=cur && pre.next.val<insertNode.val){
                    pre=pre.next;
                }
                cur.next=insertNode.next;
                insertNode.next=pre.next;
                pre.next=insertNode;
                pre=frontier;
            }
        }
        return frontier.next;
    }
}
