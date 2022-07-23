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
        ListNode newL1 = reverse(l1);
        ListNode newL2 = reverse(l2);
        
        ListNode ansList = add(newL1, newL2);
        ListNode ans = reverse(ansList);
        
        return ans;
        
        
    }
    public ListNode add(ListNode l1, ListNode l2){
         ListNode dummy = new ListNode(-1);
        ListNode r = dummy;
        int carry = 0;
        
        while(l1 !=null || l2!=null){
           int res = 0;
            if(l1 !=null){
                res += l1.val;
                l1= l1.next;
            }
            if(l2 !=null){
                res += l2.val;
                l2= l2.next;
            }
            res+= carry;
            
            if(res>=10){
                carry = 1;
            }
            else{
                carry = 0;
            }
                
            
            dummy.next =new ListNode(res%10);
            
        
           
          
            dummy = dummy.next;
                
        }
        
        if(carry == 1)
            dummy.next = new ListNode(1);
        
       return r.next; 
    }
    public ListNode reverse(ListNode head){
         ListNode curNode = head;
        ListNode t = null;
        ListNode prev = null;
        
        while(curNode != null){
            t = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = t;
        }
        
        return prev;
    }
}