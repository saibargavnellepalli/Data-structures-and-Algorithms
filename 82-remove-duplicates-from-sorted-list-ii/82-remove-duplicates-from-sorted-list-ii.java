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
    public ListNode deleteDuplicates(ListNode head) {
     
        ListNode dummy = new ListNode(-200);
        dummy.next = head;
         ListNode prev = dummy;
        
        boolean f = false;
      while(head != null && head.next != null){
          if(head.val == head.next.val){
          while(head.next != null && head.val == head.next.val){
              f =  true;
              head = head.next;
          }
          head = head.next;
          prev.next = head;
      }
          else{
              prev = head;
              head = head.next;
          }
    }
        
        return dummy.next;
        
    }
}