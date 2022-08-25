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
    public int pairSum(ListNode head) {
        
        ListNode sp = head;
        ListNode fp = head;
        
        while(fp.next!= null && fp.next.next != null){
            sp = sp.next;
            fp = fp.next.next;
        }
        
        ListNode toRev = sp.next;
        sp.next = null;
        ListNode firstHalf = head;
        
        ListNode secondHalf = reverseList(toRev);
        ListNode r1 = firstHalf;
        ListNode r2 = secondHalf;
        while(r1 != null){
            System.out.print(r1.val+" ");
            r1 = r1.next;
        }
           System.out.println("kjgvbn");
                while(r2 != null){
            System.out.print(r2.val+" ");
            r2 = r2.next;
        }
        int max = Integer.MIN_VALUE;
        while(firstHalf != null && secondHalf != null){
            max = Math.max(max, firstHalf.val+secondHalf.val);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return max;
    }
    
    public ListNode reverseList(ListNode head) {
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