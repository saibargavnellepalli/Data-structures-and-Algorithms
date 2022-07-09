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
    int arr=0;
    public int pathSum(TreeNode root, int k) {
     
        if(root==null)
            return 0;
        totalPaths(root,0,k);
        pathSum(root.left,k);
        pathSum(root.right,k);
        return arr;
        
    }
    private void totalPaths(TreeNode root, int currentSum, int k){
        if(root==null)
            return ;
       
        currentSum+=root.val;
        //found 1 path, increment in our answer
        if(currentSum==k){
          arr++;
            
        }
        
        //left call
       totalPaths(root.left, currentSum,k);
        //right call
      totalPaths(root.right, currentSum,k);
        return;
    }
}