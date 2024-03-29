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
    public ListNode removeElements(ListNode head, int n) {
        
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        
        ListNode cur = dummy;
        
        
        while(cur != null && cur.next != null){
            
            if(cur.next.val  == n){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }
        
        return dummy.next;
    }
}