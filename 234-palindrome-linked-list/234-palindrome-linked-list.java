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
        
        while(fp.next!=null && fp.next.next!=null){
            sp = sp.next;
            fp = fp.next.next;
        }
        
        
        ListNode temp = sp.next;
        if(temp !=null ){
        sp.next = null;
        ListNode l1 = head;
        ListNode l2 = reverseList(temp);
        
        while(l2!=null){
            if(l1.val != l2.val)
                return false;
            
            l1 = l1.next;
            l2 = l2.next;
        }
    }
        
        return true;
        
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        ListNode t = null;
        ListNode prev = null;
        
        while(curNode != null){
            t = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = t;
        }
        
        return prev;
        
    }
}