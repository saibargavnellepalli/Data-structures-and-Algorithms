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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        
        int left = checkL(root);
        int right = checkR(root);
        
        if(left == right){
            return ((2<<(left))-1);
        }
        else{
          return  1+countNodes(root.left)+countNodes(root.right);
        }
    }
    public static int checkL(TreeNode root){
        int h=0;
        TreeNode t = root;
        
        while(t.left != null){
            t = t.left;
            h++;
        }
        return h;
    }
    
    public static int checkR(TreeNode root){
        int h=0;
        TreeNode t = root;
        
        while(t.right != null){
            t = t.right;
            h++;
        }
        
        return h;
    }
}