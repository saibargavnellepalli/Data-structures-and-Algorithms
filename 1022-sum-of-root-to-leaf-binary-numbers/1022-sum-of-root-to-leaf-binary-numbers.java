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
    public int sumRootToLeaf(TreeNode root) {

        int[] ans = new int[1];
        String curr ="";
        if(root!=null)
            curr += root.val;
        rootToLeaf(root,curr,ans);
        return ans[0];
    }
    
    public void rootToLeaf(TreeNode root, String curr, int[] ans){
        
        if(root == null)
            return;
    
        //root is leaf condition
        if(root.left == null && root.right == null)
        {
            //add current path stored in string to my answer
            ans[0]+= Integer.parseInt(curr,2);
            return;
        }
        
        //left call
        if(root.left !=null)
        rootToLeaf(root.left,curr+root.left.val,ans);
            
                  //right call
        if(root.right !=null)
        rootToLeaf(root.right,curr+root.right.val,ans);
        
    }
    
}