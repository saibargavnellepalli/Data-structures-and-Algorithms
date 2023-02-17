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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1);
        ListNode l1 = reverse(list1);
        ListNode l2 = reverse(list2);
        int carry = 0;
        ListNode d = ans;
        
        while(l1 != null || l2 != null){
            
            int sum = 0;
            if(l1 != null){
               sum += l1.val;
                
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            
            sum += carry;
            
            ListNode newNode = new ListNode(sum%10);
            
            carry = sum/10;
            
            ans.next = newNode;
            ans = ans.next;
        }
        if(carry == 1){
             ListNode newNode = new ListNode(1);
             ans.next = newNode;
            ans = ans.next;
        }
        return reverse(d.next);
    }
    
    public ListNode reverse(ListNode head){
        
        ListNode ans = null;
                
               
        while(head != null){
            ListNode next = head.next;
            
           head.next = ans; 
            ans = head;
            head = next;
            
            
        }
        
        return ans;
    }
}