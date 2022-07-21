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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curNode = head;
        
        
        while(curNode != null){
            if(curNode.val == val){
                prev.next = curNode.next;
            }
            else{
                prev = curNode;
            }
            curNode = curNode.next;
        }
        
       
        
        return dummy.next;
    }
}