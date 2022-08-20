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
        
        if(head == null)
            return head;
        ListNode dummy = new ListNode(-200);
        dummy.next = head;
       ListNode prev = dummy;
        int dup = -200;
        while(head != null && head.next != null){
            if( head != null && head.next != null && head.next.val == head.val){
                dup = head.val;
                while(head != null && head.val == dup){
                    head = head.next;
                }
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