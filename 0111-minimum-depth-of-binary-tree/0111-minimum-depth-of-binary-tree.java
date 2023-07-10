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
    public int minDepth(TreeNode root) {
        
        if(root == null) return 0;
       return f(root,1);
        
    
    }
    
    public int f (TreeNode root, int h){
        
        if(root == null) return 10000;
        
        if(root.left == null && root.right == null) return h;
        
        int left = f(root.left,h+1);
        int right = f(root.right,h+1);
        
        return Math.min(left,right);
    }
}