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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        //find mid
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        
        while(fastPtr.next != null && fastPtr.next.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        
        ListNode rightHalf = slowPtr.next;
        slowPtr.next = null;
        ListNode leftHalf = head;
        
       ListNode left =  sortList(leftHalf);
       ListNode right =  sortList(rightHalf);
        
       return mergeTwoLists(left, right); 
       
    }
    
      public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        while(l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                //int a = 1;
                ListNode n = new ListNode(l1.val);
                temp.next = n;
                l1 = l1.next;
            }
            else{
                ListNode n = new ListNode(l2.val);
                temp.next = n;
                l2 = l2.next;
            }
            temp = temp.next;
            
        }
        
        if(l1 == null)
            temp.next = l2;
        else if(l2 == null){
            temp.next = l1;
        }
        
        return dummy.next;
        
    }
}

