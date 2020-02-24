package FindKToTail;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            this.val = v;
        }

        public ListNode FindKthToTail(ListNode head, int k) {
            int len = size(head);
            if (k > len || k < 0 || head == null) {
                return null;
            }
            int step = len - k;
            for (int i = 0; i < step; i++) {
                head = head.next;
            }
            return head;
        }

        private int size(ListNode head) {
            int size = 0;
            for (; head.next != null; head = head.next) {
                size++;
            }
            return size;
        }
    }
}