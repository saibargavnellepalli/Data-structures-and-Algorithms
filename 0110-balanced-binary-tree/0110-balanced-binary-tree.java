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
        return ans;
    }
    public int checkForBalanced(TreeNode root){
        if(root == null) return 0;
        
        int left = 1+checkForBalanced(root.left);
        int right = 1+checkForBalanced(root.right);
        
        if(Math.abs(left-right) > 1) ans = false;
        
        return Math.max(left,right);
    }
}