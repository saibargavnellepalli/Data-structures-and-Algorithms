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
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null)
            return null;
        ListNode fp = head;
        ListNode sp = head;
        ListNode t = head;

        
        while( fp.next != null && fp.next.next != null){
            
            fp = fp.next.next;
            sp = sp.next;
            
            if(fp == sp){
                 while(t != sp){
            sp = sp.next;
            t = t.next;
        }
                return t;
            }
        }
        
        
       return null;
    }
}