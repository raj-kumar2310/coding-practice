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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=head;
        ListNode t=head;
        int l=0;

        while(t!=null){
            l++;
            t=t.next;
        }
        if(l==n)return head.next;
        for(int i=0;i<l-n-1;i++){
            node =node.next;
        }

        if(node ==null || node.next==null)return node;

        System.out.print(node.val);
        node.next=node.next.next;


        return head;
        
    }
}