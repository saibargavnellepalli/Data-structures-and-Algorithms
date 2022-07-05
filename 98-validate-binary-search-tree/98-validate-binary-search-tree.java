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
  class Node {
      long data;
      
   Node(long data){
     this.data = data;
 }
      }
  
class Solution {
    public boolean isValidBST(TreeNode root) {
       
      
       Node prev = new Node(Long.MIN_VALUE);
       
       return isBST(root,prev);
        
    }
    private boolean isBST(TreeNode root, Node preVal){
        if(root == null)
            return true;
       boolean left= isBST(root.left, preVal);
        
        if(root.val <= preVal.data)
            return false;
        preVal.data = root.val;
        
        return left && isBST(root.right,preVal);
    }
    
}