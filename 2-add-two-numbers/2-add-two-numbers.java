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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        int carry = 0;
        while(l1 != null && l2 != null){
            
            int val = l1.val + l2.val + carry;
            carry = val/10;
            ListNode t = new ListNode(val%10);
            node.next = t;
            node = node.next;
            l1= l1.next;
            l2 = l2.next;
            
        }
        
        while(l1 != null){
             int val = l1.val + carry;
            carry = val/10;
            ListNode t = new ListNode(val%10);
            node.next = t;
            node = node.next;
            l1=l1.next;
        }
        
           while(l2 != null){
             int val = l2.val + carry;
            carry = val/10;
            ListNode t = new ListNode(val%10);
            node.next = t;
            node = node.next;
            l2 = l2.next;
        }
        
        if(carry == 1){
         ListNode t = new ListNode(carry);
        node.next = t;
        }
        
        return dummy.next;
        
    }
}