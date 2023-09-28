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
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        
        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;
        
        int carry = 0;
        
        while(h1 != null || h2 != null || carry == 1){
            int sum = 0;
            sum += carry;
            
            if(h1 != null){
                sum += h1.val;
                h1 = h1.next;
            }
            
            if(h2 != null){
                sum += h2.val;
                h2 = h2.next;
            }
            
            if(sum > 9){
                carry =1;
            }
            else{
                carry = 0;
            }
            
            ListNode newNode = new ListNode(sum%10);
            
            ans.next = newNode;
            
            ans = ans.next;
        }
        
        return dummy.next;
        
    }
}