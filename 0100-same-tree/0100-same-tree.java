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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
    
        // structure has to be same -> 
        // if (p != null and q == null) -> false
        // if(p == null and q != null) -> false
        // data has to be same
        // if(p.data not equal to q.data) - false
        
        // if(p and q -> null) -> true;
        
         if(p == null && q == null) return true;
        
        if((p != null && q == null)  || (p == null && q != null)) return false;
        
        if(p.val != q.val) return false;
        
        
       
        
        boolean left = isSameTree(p.left,q.left);
       boolean right = isSameTree(p.right,q.right);
        
        
     return left && right;
    }
}