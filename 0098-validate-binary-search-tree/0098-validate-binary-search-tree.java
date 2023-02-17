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
    boolean f = true;
    
    public boolean isValidBST(TreeNode root) {
        long prev[] = {Long.MIN_VALUE};
        f(root,prev);
        
        return f;
    }
    public void f(TreeNode root, long[] prev){
        
       if(root == null) return;
        
        f(root.left,prev);
        
        if(root.val <= prev[0]){
            f = false;
            return;
        }
        
        prev[0] = root.val;
        
        f(root.right,prev);
    }
}