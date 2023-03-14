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
    public int sumNumbers(TreeNode root) {
        int[] ans = {0};
        
        pathSum(root,ans,0);
        return ans[0];
    }
    
    public void pathSum(TreeNode root, int ans[], int sum){
        
        if(root == null) return;
        
        if(root.left == null && root.right == null){
            ans[0] += sum+root.val;
            return;
        }
        
        // left and right subtree calls
        pathSum(root.left,ans,(sum+root.val)*10);
        pathSum(root.right,ans,(sum+root.val)*10);
        
        return;
        
    }
}