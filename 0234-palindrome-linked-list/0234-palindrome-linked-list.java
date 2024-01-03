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
        
        // 1 2 2 1
        
        if(head.next == null) return true;
        
        ListNode fp = head;
        ListNode sp = head;
        ListNode prev = null;
        
        while(fp != null && fp.next != null){
            prev = sp;
            fp = fp.next.next;
            sp = sp.next;
        }
        
        prev.next = null;
        
        ListNode newList1 = head;
        ListNode newList2 = reverseList(sp);
        
        while(newList1 != null && newList2 != null){
            if(newList1.val != newList2.val) return false;
            
            newList1 = newList1.next;
            newList2 = newList2.next;
                
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