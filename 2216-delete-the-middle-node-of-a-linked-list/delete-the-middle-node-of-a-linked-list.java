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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null || head==null)return null;
            ListNode f=head;
            ListNode t=null;
            ListNode s=head;

            while(f!=null && f.next!=null){
                t=s;
                s=s.next;
                f=f.next.next;
            }


            t.next=s.next;

            return head;

        
    }
}