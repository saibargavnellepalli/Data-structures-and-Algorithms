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
        
        ListNode sp = head;
        ListNode fp = head;
        
        int i=1;
        
        ListNode first = null;
        ListNode second = null;
        
        
        while(i<k){
            fp = fp.next;
            i++;
        }
        
        first = fp;
        
        while(fp.next != null){
            sp = sp.next;
            fp = fp.next;
        }
        
        second = sp;
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
        
    }
}