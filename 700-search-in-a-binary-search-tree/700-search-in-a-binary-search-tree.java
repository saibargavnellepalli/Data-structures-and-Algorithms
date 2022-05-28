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
            
        if(root == null)
            return null;
        
        if(root.val == key)
            return root;
        if(key < root.val)
            return searchBST(root.left,key);
        else if(key > root.val)
           return searchBST(root.right,key);
        
        return root;
        }
    }
