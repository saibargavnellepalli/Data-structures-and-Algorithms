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
    public TreeNode insertIntoBST(TreeNode root, int key) {
        TreeNode curr = new TreeNode(key);
        TreeNode dummy = root;
         TreeNode curr2 = root;
        
        
        if (root == null){
            root = curr;
           return root;
        }
        
        
        while(root!=null){
             curr2 = root;
        if(key < root.val){
     
            root = root.left;
        }
        else{
          
            root = root.right;
        }
    }
       if(key < curr2.val)
           curr2.left = curr;
       
        else
            curr2.right = curr;
        
        
        return dummy;
        
    }
   }
