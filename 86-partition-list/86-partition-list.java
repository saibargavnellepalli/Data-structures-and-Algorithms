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
    public ListNode partition(ListNode head, int x) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode fprev = dummy;
        
        while(head != null){
            if(head.val >= x)
                break;
            fprev = head;
            head = head.next;
        }
        
        ListNode prev = head;
        
        while(head != null){
            if(head.val < x){
                ListNode newNode = new ListNode(head.val); 
                ListNode t = fprev.next;
                fprev.next = newNode;
                newNode.next = t;
                fprev = newNode;
                prev.next = head.next;
                head = prev.next;
            }
            else{
                prev = head;
                head = head.next;
            }
        }
        
        return dummy.next;
    }
}