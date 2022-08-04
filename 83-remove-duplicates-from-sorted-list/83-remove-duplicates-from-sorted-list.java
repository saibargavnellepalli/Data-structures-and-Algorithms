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
        ListNode prev = dummy;
        ListNode cur = head;
        dummy.next = head;
        
        while(cur != null){
            
        if( prev.val == cur.val){
            prev.next = cur.next;
        }
         else{
        prev = cur;
        
        }
            cur = cur.next;
    }
        
    return dummy.next;
        
        
    }
}