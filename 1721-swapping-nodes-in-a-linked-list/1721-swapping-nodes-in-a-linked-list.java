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
    public ListNode swapNodes(ListNode head, int k) {
        
        
        ListNode fp = head;
        ListNode sp = head;
        
        int ind = 1;
        
        while(ind < k){
            fp = fp.next;
            ind++;
            
        }
        
        ListNode first = fp;
        
        while(fp.next != null){
            sp = sp.next;
            fp = fp.next;
        }
        
        ListNode second = sp;
        
        int temp = first.val;
        
        first.val = second.val;
        
        second.val = temp;
        
        
        return head;
        
        
    }
}