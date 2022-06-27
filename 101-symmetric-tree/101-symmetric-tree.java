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
        
        boolean arr[] = {true};
        isMirror(root,root,arr);
        return arr[0];
    }
    public void isMirror(TreeNode root1, TreeNode root2,boolean[] arr){
        if(root1==null && root2==null)
            return;
        if(root1==null || root2==null || root1.val!=root2.val){
            arr[0]=false;
            return;
        }
        isMirror(root1.left,root2.right,arr);
        isMirror(root1.right,root2.left,arr);
        return;
        
      
    }
}