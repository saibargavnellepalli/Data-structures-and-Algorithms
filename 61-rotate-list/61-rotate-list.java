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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        int len = 1;
        ListNode tail = head;
        
        while(tail.next != null){
            len += 1;
            tail = tail.next;
        }
        
        tail.next = head;
        
        int newLen = len - k%len;
        
        for(int i=1;i<=newLen;i++){
            tail = tail.next;
        }
        ListNode ans = tail.next;
        tail.next = null;
        
        return ans;
        
    }
}