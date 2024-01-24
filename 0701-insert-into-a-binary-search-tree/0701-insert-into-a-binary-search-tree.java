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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode ans = root;
        
        while(root != null){
            
            if(val > root.val){
                
                if(root.right == null){
                    root.right = new TreeNode(val);
                    return ans;
                }
                root = root.right;
                
            }
            else if(val < root.val){
                 
                if(root.left == null){
                    root.left= new TreeNode(val);
                    return ans;
                }
                root = root.left;
            }
            
        }
        
        return new TreeNode(val);
        
    }
}