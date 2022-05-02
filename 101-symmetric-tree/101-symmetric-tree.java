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
    public boolean isSymmetric(TreeNode root) {
        
        boolean bool[] = new boolean[1];
         bool[0] = true;
        symmetric(root,root,bool);
        return bool[0];
        
    }
    
    public void symmetric(TreeNode root1,TreeNode root2, boolean[] bool){
        
        if(root1 == null && root2 != null ){
            bool[0] = false;
            return;
        }
        
         if(root2 == null && root1 != null ){
            bool[0] = false;
            return;
        }
        
        if(root1 == null || root2 == null)
            return;
   
        if(root1.val!=root2.val){
            bool[0] = false;
            return;
        }
      
        symmetric(root1.left,root2.right,bool);
        symmetric(root1.right,root2.left,bool);
        
    }
}