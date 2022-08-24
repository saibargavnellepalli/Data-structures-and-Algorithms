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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        int sum = 0;
        boolean f = true;
        boolean s = false;
        while(head != null){
            if(head.val == 0 && f != true){
                ListNode node1 = new ListNode(sum);
                node.next = node1;
                node = node.next;
                sum = 0;
            }
            f = false;
            sum += head.val;
            head = head.next;
        }
        
        return dummy.next;
    }
}