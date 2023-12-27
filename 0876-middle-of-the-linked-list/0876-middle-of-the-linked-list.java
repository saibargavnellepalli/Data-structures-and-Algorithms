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
        
       
       ListNode fp = head;
       ListNode sp = head;
        
        while(fp != null  && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
        }
        
        return sp;
    }
}