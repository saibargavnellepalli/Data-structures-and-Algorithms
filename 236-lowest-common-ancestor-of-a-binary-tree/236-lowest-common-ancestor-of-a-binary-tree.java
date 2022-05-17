/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        boolean[] found = {false, false};
  
     TreeNode ans =   lca(root,p,q,found);
        
        return found[0] == true && found[1] == true ? ans : null;
    }
    
    private TreeNode lca(TreeNode root, TreeNode p, TreeNode q,  boolean[] found ){
    
        if(root == null)
              return null;
        
        TreeNode left = lca(root.left, p,q,found);
        TreeNode right = lca(root.right, p,q,found);
        
          
    
          if(root == p){
              found[0] = true;
            return root;
          }
        
         if(root == q){
              found[1] = true;
            return root;
          }
        
        if(left == null)
            return right;
        
        
        if(right == null)
            return left;
        
        
            return root;
    }
}
