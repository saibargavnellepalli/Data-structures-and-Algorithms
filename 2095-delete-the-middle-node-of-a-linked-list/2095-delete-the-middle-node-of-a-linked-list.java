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
         if(head == null)
            return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode sp = head;
        ListNode fp = head;
       // ListNode prev = null;
        
        while(fp != null){
            if(fp.next == null){
                
               prev.next = sp.next;
                return dummy.next;
            }
            prev = sp;
            sp = sp.next;
            fp = fp.next.next;
        }
        if(fp == null){
             prev.next = sp.next;
                return head;
            //return sp;
        }
        
        return fp;
    }
}