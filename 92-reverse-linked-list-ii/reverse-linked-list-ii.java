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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        ListNode c=head;
        ListNode p=null;

        for(int i=0;c!=null&&i<left-1;i++){
            p=c;
            c=c.next;
        }

        ListNode last=p;
        ListNode end=c;

        ListNode n=c.next;
        for(int i=0;c!=null&&i<right-left+1;i++){
            c.next=p;
            p=c;
            c=n;
            if(n!=null)n=n.next;
        }

        if(last!=null){
            last.next=p;
        }else{
            head=p;
        }

        end.next=c;

        return head;
    }
}