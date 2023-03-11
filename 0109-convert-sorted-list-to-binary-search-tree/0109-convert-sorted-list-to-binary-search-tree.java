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
        ArrayList<Integer> list = new ArrayList<>();
        
        makeList(head,list);
        return buildTree(0,list.size()-1,list);
    }
    public void makeList(ListNode tempNode, ArrayList<Integer> list){
        
        while(tempNode != null){
            list.add(tempNode.val);
            tempNode = tempNode.next;
        }
    }
    
    public TreeNode buildTree(int start, int end,ArrayList<Integer> list){
        
        
        if(start>end) return null;
        
        int mid = start+(end-start)/2;
        
        // new Node to add into tree
        TreeNode newNode = new TreeNode(list.get(mid));
        
        // making left subtree
        newNode.left = buildTree(start,mid-1,list);
        
        // making right subtree
        newNode.right = buildTree(mid+1,end,list);
        
        return newNode;
    }
}