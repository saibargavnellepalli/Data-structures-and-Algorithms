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
    public ListNode oddEvenList(ListNode head) {
        
        
          ListNode odd = new ListNode(-1);
          ListNode even = new ListNode(-1);
        
          ListNode startOdd = odd;
          ListNode startEven = even;
        
        
           int ind = 1;
        
        
           while( head != null){
               
               
               if(ind%2 != 0){
                   odd.next = head;
                   odd = odd.next;
                   
                   if(head.next == null) even.next = null;
               }
               else{
                   even.next = head;
                   even = even.next;
                   
                   if(head.next == null) odd.next = null;
               }
               
               head = head.next;
               
               ind+=1;
               
           }
        
        odd.next = startEven.next;
        
        
        return startOdd.next;
        
        
        
    }
}