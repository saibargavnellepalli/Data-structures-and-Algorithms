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
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
       int a = checkForBalanced(root);
       if(a == -1) return false;
        
        return true;
    }
    public int checkForBalanced(TreeNode root){
        if(root == null) return 0;
        
        int left = checkForBalanced(root.left);
        int right = checkForBalanced(root.right);
        
        if(left == -1 || right == -1) return -1;
        
        if(Math.abs(left-right) > 1) return -1;
        
        return 1+Math.max(left,right);
    }
}