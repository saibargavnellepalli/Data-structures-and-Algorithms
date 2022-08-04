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
        
      if(head == null)
          return false;
        
       ListNode sp = head;
       ListNode fp = head;
        
        while(fp.next != null && fp.next.next != null){
            
            
            sp = sp.next;
            fp = fp.next.next;
            if(fp == sp)
                return true;
        }
        
        return false;
    }
}