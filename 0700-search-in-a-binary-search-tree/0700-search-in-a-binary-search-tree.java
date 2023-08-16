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
    public TreeNode searchBST(TreeNode root, int key) {
        
       
        // bst -> deciding to which part we have to move
        
      // key -> 2
        
        while(root != null){
        if(key < root.val){
            root = root.left;
        }
        else if(key > root.val){
            root = root.right;
        }
        else{
            return root;
        }
            
        }
        
        return null;
        
    }
}