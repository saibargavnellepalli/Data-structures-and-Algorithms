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
     
        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;
        int carry = 0;
        
        while(l1 != null && l2 != null){
            
            
            int valOfList1 = l1.val;
            int valOfList2 = l2.val;
            
            int sum = valOfList1 + valOfList2+carry;
            
            if(sum >= 10){
                
                carry = sum/10;
                sum = sum%10;
            }
            
            else{
                carry = 0;
            }
            
            
            ListNode newNode = new ListNode(sum);
            
            
            ans.next = newNode;
            ans = ans.next;
            
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        
        while(l1 != null){
            
            int sum = l1.val + carry;
            
            if(sum >= 10){
                carry = sum/10;
                sum = sum%10;
            }
            else{
                carry = 0;
            }
            
            
            
            ListNode newNode = new ListNode(sum);
            
            ans.next = newNode;
            ans = ans.next;
            
            l1 = l1.next;
            
        }
        
        
         while(l2 != null){
            
            int sum = l2.val + carry;
            
            if(sum >= 10){
                carry = sum/10;
                sum = sum%10;
            } else{
                carry = 0;
            }
            
            
            
            
            ListNode newNode = new ListNode(sum);
            
            ans.next = newNode;
            ans = ans.next;
            
            l2 = l2.next;
            
        }
        
        if(carry > 0){
             ListNode newNode = new ListNode(carry);

            ans.next = newNode;
        }
        
        
        return dummy.next;
    }
}