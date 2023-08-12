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
            
        if(root.val  < val){
            
            if(root.right == null){
                TreeNode newNode = new TreeNode(val);
                
                root.right = newNode;
                
                return ans;
            }
            
            root = root.right;
        }
        else if(root.val > val){
            
            if(root.left == null){
                 TreeNode newNode = new TreeNode(val);
                
                root.left = newNode;
                
                return ans;
            }
            
            root = root.left;
        }
        }
        
        TreeNode newNode = new TreeNode(val);
        
        return newNode;
    }
}