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
        
        while(fp.next != null && fp.next.next != null){
            fp = fp.next.next;
            sp = sp.next;
        }
    
        ListNode firstList = head;
        ListNode secondList = sp.next;
        sp.next = null;
        
        ListNode revList = rev(secondList);
        
    //     ListNode c1 = revList;
    
        while(revList != null){
            if(firstList.val != revList.val)
                return false;
            
            firstList = firstList.next;
            revList = revList.next;
        }
        return true;
    }
    private ListNode rev(ListNode head){
       ListNode revL = null;
       ListNode curNode = head;
       ListNode temp = head;
        
        while(curNode != null){
            temp = curNode.next;
            curNode.next = revL;
            revL = curNode;
            curNode = temp;
        }
        
        return revL;
        
        
    }
    
}