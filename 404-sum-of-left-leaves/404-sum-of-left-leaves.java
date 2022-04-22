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
    public int sumOfLeftLeaves(TreeNode root) {
        
        int ans[] = new int[1];
        
        leftSum(root,false,ans);
        return ans[0];
    }
    
    public void leftSum(TreeNode root, boolean flag,int[] ans ){
        
        if(root == null)
            return;
        
        //leaf node condition
        if(root.left==null && root.right==null && flag == true){
            ans[0]+=root.val;
        }
     
        leftSum(root.left,true,ans);
        leftSum(root.right,false,ans);
        
        
    }
}