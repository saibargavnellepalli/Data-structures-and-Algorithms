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
        
        int c = 0;
        ListNode ans = l1;
        ListNode prev = null;
        
        while(l1 != null || l2 != null){
            
            int sum = 0;
            
            if(l1.next == null && l2 != null){
                l1.next = l2.next;
                l2.next = null;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            if(l1 != null){
                sum += l1.val;
                sum += c;
                c = sum/10;
                
                l1.val = sum%10;
                prev = l1;
                l1 = l1.next;
            }
        }
        
        if(c != 0){
            ListNode a = new ListNode(c);
            prev.next = a;
        }
       
        
        return ans;
    }
}