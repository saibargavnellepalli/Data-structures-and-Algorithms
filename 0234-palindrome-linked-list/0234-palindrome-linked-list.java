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
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null) return true;
        
        ListNode sp=head;
        ListNode fp = head;
        ListNode prev = null;
        
        while(fp != null && fp.next != null){
            prev = sp;
            sp = sp.next;
            fp = fp.next.next;
        }
        
        prev.next = null;
        
       ListNode l1 = head;
       ListNode l2 = (fp == null) ? reverseList(sp) : reverseList(sp.next);
        
        while(l1 != null && l2 != null){
            if(l1.val != l2.val) return false;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return true;
        
        
    }
    
      public ListNode reverseList(ListNode head) {
      
      
        ListNode ans = null;
        
        while(head != null){
            
            ListNode temp = head.next;
            
            head.next = ans;
            ans = head;
            
            head = temp;
            
        }
        return ans;
           
    }
}