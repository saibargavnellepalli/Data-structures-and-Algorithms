/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null)
            return false;
        
        ListNode fp = head;
        ListNode sp = head;
        
        while(fp.next != null && fp.next.next != null){
            fp = fp.next.next;
            sp = sp.next;
            
            if(fp == sp)
                return true;
        }
        
        return false;
    }
}