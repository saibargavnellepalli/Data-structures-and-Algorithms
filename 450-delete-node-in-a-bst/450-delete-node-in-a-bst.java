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
    public TreeNode deleteNode(TreeNode root, int key) {
        
      if(root == null)
          return null;
        
       if(key < root.val)
           root.left = deleteNode(root.left,key);
       
       else if(key > root.val)
           root.right = deleteNode(root.right,key);
        
        else{
            if(root.left == null && root.right == null){
                root = null;
                return null;
            }
            
           else if(root.left == null && root.right != null){
                root = root.right;
                return root;
            }
            
           else if(root.left != null && root.right == null){
                root = root.left;
                return root;
            }
            TreeNode subsNode = findMin(root.right);
            root.val = subsNode.val;
            
            root.right = deleteNode(root.right,subsNode.val);
        }
        
        return root;
    }
    private TreeNode findMin(TreeNode curr){
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}