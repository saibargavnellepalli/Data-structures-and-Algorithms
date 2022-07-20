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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        ListNode d = new ListNode(-1);
        ListNode r = d;
        
         ListNode l1 =  list1;
         ListNode l2 =  list2;
        
        while(l1!= null && l2!=null){
            
          
            if(l1.val < l2.val){
                ListNode node = new ListNode(l1.val);
                d.next = node;
               d=d.next; 
                l1 = l1.next;
            }
            else{
                 ListNode node = new ListNode(l2.val);
                d.next = node;
               d=d.next; 
                l2 = l2.next;
            }
                
        }
        
          if(l1!=null){
                d.next = l1;
                
            }
             if(l2 != null){
                d.next = l2;
               
            }
        
        return r.next;
        
    }
}