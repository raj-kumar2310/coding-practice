/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k <= 1)
            return head;

        int l = length(head);
        ListNode p = null;
        ListNode c = head;

        int count = l / k;

        while (count > 0) {
            ListNode last = p;
            ListNode end = c;
            ListNode n = c.next;

            for (int i = 0; c != null && i < k; i++) {
                c.next = p;
                p = c;
                c = n;
                if (n != null)
                    n = n.next;
            }

            if (last != null) {
                last.next = p;
            } else {
                head = p;
            }

            end.next=c;

            p=end;

            count--;

        }

        return head;

    }

    static int length(ListNode head) {
        int l = 0;
        ListNode t = head;

        while (t != null) {
            t = t.next;
            l++;
        }

        return l;
    }
}