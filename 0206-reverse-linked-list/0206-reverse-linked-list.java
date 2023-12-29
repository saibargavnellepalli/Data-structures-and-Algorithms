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

// node 1 -> #30129
// node 2 -> #45350
// node 3 -> #45351
// node 4 -> #30122
// node 5 -> #45353


// ListNode newNode = new ListNode(5);

// newNode -> #84899

class Solution {
    public ListNode reverseList(ListNode head) {
      
      ListNode ans = null;
     
        
        while( head != null){
            
            ListNode nextNode = head.next;
            
            head.next = ans;
            ans= head;
            
            head = nextNode;
        }
            
        
           return ans; 
    }
}