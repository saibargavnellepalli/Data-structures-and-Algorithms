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
    public ListNode swapNodes(ListNode head, int n) {
      if(head == null || head.next == null){
          return head;
      }
          ListNode sp = head;
        ListNode fp = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        
        int i=1,k=1;
        ListNode toSwap = head;
        while(i<=n){
           
            fp = fp.next;
           if(i==n-1)
               toSwap = fp;
            i++;
        }
        
        while(fp != null){
            
            prev = sp;
            sp = sp.next;
            fp = fp.next;
        }
        
       // prev.next = sp.next;
        int te = toSwap.val;
        toSwap.val = sp.val;
        sp.val = te;
        
        
        return dummy.next;
        
    }
}