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
            ListNode t=head;
            int l=0;

            while(f!=null && f.next!=null){
                f=f.next.next;
                l++;
            }

            System.out.println(l);

            for(int i=0;i<l-1;i++){
                t=t.next;
            }

            if(t.next!=null)t.next=t.next.next;

            return head;

        
    }
}