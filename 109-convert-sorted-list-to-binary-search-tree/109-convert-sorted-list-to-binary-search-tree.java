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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        
        return toBst(head,null);
    }
    public TreeNode toBst(ListNode head, ListNode tail){
        ListNode sp = head;
        ListNode fp = head;
        
        if(head == tail)
            return null;
        
        while(fp != tail && fp.next != tail){
            fp = fp.next.next;
            sp = sp.next;
        }
        
        TreeNode node = new TreeNode(sp.val);
        
        node.left = toBst(head,sp);
        node.right = toBst(sp.next, tail);
        
        return node;
        
        
    }
}