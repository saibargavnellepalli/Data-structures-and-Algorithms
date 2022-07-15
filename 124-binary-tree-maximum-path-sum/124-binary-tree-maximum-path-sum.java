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
    public int maxPathSum(TreeNode root) {
        
        int arr[] = {0};
        arr[0]= Integer.MIN_VALUE;
         maxPath(root, arr);
        return arr[0];
    }
    private int maxPath(TreeNode root, int arr[]){
        if(root == null)
            return 0;
        
        int left = Math.max(0,maxPath(root.left,arr));
        int right = Math.max(0,maxPath(root.right,arr));
        
        arr[0] = Math.max(left+right+root.val,arr[0]);
        
        return root.val+Math.max(left,right);
        
        
    }
}