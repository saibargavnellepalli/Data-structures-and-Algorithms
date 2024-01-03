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
        
        
        if(head.next == null)  return true;
        
        //step-1 [Middle of LL]
        ListNode fp = head;
        ListNode sp = head;
        ListNode prev = null;
        
        while(fp != null && fp.next != null){
            prev = sp;  
            sp = sp.next;
            fp = fp.next.next;
          
        }
        
        //step -2 
        
        prev.next = null;
        
        ListNode firstHalf = head;
        ListNode secondHalf = sp;
        
        // step- 3
        secondHalf = reverseList(sp);
        
        //step-4
        while(firstHalf != null && secondHalf != null){
            
            if(firstHalf.val != secondHalf.val){
                return false;
                }
            
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
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