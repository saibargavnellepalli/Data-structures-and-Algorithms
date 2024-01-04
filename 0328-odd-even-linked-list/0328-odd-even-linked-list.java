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
        
        ListNode cur = head;
        
       int ind=1;
        
        while(cur != null){
            
            if(ind%2 != 0){
                odd.next = cur;
                odd = odd.next;
                
                if(cur.next == null) even.next = null;
                
            }
            else{
                even.next = cur;
                even = even.next;
                
                if(cur.next == null) odd.next = null;
            }
            
            ind++;
            
            cur = cur.next;
        }
        
        odd.next = startEven.next;
        
        return startOdd.next;
    }
}