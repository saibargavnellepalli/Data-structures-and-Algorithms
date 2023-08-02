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
    public ListNode reverseList(ListNode head) {
      
        ListNode ans = null;
        ListNode t = head;
        
        while(head != null){
        
            ListNode temp = head.next;
            
            head.next = ans;
            
            ans = head;
            
            head = temp;
        }
        
        return ans;
    }
}