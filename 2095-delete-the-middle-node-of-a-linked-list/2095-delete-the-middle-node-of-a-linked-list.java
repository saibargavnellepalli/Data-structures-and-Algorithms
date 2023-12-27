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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        ListNode prev = null;
       
         if(head.next == null)
        return null;

        while(fastPointer!=null && fastPointer.next != null){
            
            fastPointer = fastPointer.next.next;
            prev = slowPointer;
            slowPointer = slowPointer.next;
        }
       
     

        prev.next = slowPointer.next;

        return head;
    
    }
}