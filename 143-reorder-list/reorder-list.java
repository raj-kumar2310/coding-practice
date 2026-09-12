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
    public void reorderList(ListNode head) {

        if(head==null || head.next==null)return;
        
        ListNode m=midfind(head);
        ListNode hs=reverse(m);
        ListNode hf=head;

        while(hf!=null && hs!=null){
            ListNode t=hf.next;
            hf.next=hs;
            hf=t;

            t=hs.next;
            hs.next=hf;
            hs=t;
        }

        if(hf!=null &&hf.next!=null)hf.next=null;

    }

    static ListNode midfind(ListNode head){
        ListNode f=head;
        ListNode s=head;

        while(f!=null&& f.next!=null){
            f=f.next.next;
            s=s.next;
        }

        return s;
    }

    static ListNode reverse(ListNode head){
        ListNode p=null;
        ListNode c=head;
        ListNode n=c.next;

        while(c!=null){
            c.next=p;
            p=c;
            c=n;
            if(n!=null)n=n.next;
        }

        return p;
    }
}