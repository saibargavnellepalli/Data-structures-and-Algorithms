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
        
        ListNode sp = head;
        ListNode fp = head;
        
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
        }
        
        //System.out.println(sp.val);
        ListNode prev = rev(sp);
        ListNode st = head;
        
       
         while(prev != null){
             if(prev.val != st.val)
                 return false;
             prev = prev.next;
             st = st.next;
         }
        
        return true;
    }
    
    private ListNode rev(ListNode head){
       ListNode prev = null;
        ListNode temp = head;
        ListNode curNode = head;
        
        while(curNode != null){
            temp = curNode.next;
            curNode.next = prev;
            prev= curNode;
            curNode = temp;
        }
       
        
        return prev;
    }
}