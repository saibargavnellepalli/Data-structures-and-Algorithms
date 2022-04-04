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
    public ListNode swapNodes(ListNode head, int k) {
      
        ListNode slow = head;
        ListNode fast = head;
        ListNode first = head, second = head;
        
        int i = 1;
        while(i<k){
            fast = fast.next;
            i++;
        }
        
        first = fast;
        
        while(fast.next!=null){
            
            slow = slow.next;
            fast = fast.next;
            
        }
        
        second = slow;
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
        
        
        
    }
}