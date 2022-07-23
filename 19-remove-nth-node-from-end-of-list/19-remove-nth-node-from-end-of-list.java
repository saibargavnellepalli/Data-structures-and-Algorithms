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
        
        ListNode sp = head;
        ListNode fp = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        
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