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
    public ListNode middleNode(ListNode head) {
        if(head == null)
            return null;
        
        ListNode sp = head;
        ListNode fp = head;
        
        while(fp.next != null && fp.next.next!=null){
            
            sp = sp.next;
            fp = fp.next.next;
        }
        if(fp.next == null)
            return sp;
        
        return sp.next;
    }
}