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
        
       ListNode dummy = new ListNode(-1);
        dummy.next = head;
       ListNode prev =dummy,fp=head,sp=head;
        
        
        int i=1;
        while(i<=n){
            fp = fp.next;
            i++;
        }
        
        while(fp != null){
            prev = sp;
            sp = sp.next;
            fp = fp.next;
            
        }
        
        prev.next = sp.next;
        
        return dummy.next;
        
    }
}