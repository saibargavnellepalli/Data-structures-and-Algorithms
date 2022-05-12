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
    public boolean isUnivalTree(TreeNode root) {
        
        if(root==null)
            return false;
        
        int data = root.val;
        
        return univalue(root,data);
    }
    
    private boolean univalue(TreeNode root, int data){
        
        if(root == null)
            return true;
       
        if(root.val!=data)
            return false;
        
       boolean left=  univalue(root.left,data);
       boolean right = univalue(root.right,data);
        
        return left && right;
    }
    
}