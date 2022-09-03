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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        return reverseInKgroups(head,k);
    }
    public ListNode reverseInKgroups(ListNode head, int k){
        if(head == null)
            return null;
        
        
            ListNode current = head;
            int currentLength = 1;
            while(current.next != null && currentLength < k){
                currentLength += 1;
                current = current.next;
            }
        
        if(currentLength < k)
            return head;
            
            ListNode temp = current.next;
            current.next = null;
            
          ListNode revList = reverseList(head);
            head.next = reverseInKgroups(temp,k);
            return revList;
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