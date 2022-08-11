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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = null;
        dummy.next = head;
        
        ListNode fp = dummy;
        
        for(int i=0;i<left;i++){
            prev = fp;
            fp = fp.next;
        }
        
       prev.next = reverseList(fp, right-left+1);
       
        return dummy.next;
        
    }
    
     public ListNode reverseList(ListNode head, int n) {
         ListNode curNode = head;
        ListNode t = null;
        ListNode prev = null;
         //ListNode x = head;
        
    for(int i=0;i<n;i++){
        
      
            t = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = t;
        }
        
         head.next = curNode;
         
        return prev;
        
    }
}