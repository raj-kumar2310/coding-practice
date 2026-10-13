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
    public int getDecimalValue(ListNode head) {
        String a="";
        ListNode t=head;

        while(t!=null){
            a+=String.valueOf(t.val);
            t=t.next;
        }

        int ans=Integer.parseInt(a,2);

        // int base=1;

        // for(int i=a.length()-1;i>=0;i--){
        //     if(a.charAt(i)=='1'){
        //         ans+=base;
        //     }

        //     base=base*2;
        // }
        // System.out.println(ans);

        return ans;
    }
}