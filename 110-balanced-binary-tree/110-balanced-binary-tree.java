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
    public boolean isBalanced(TreeNode root) {
        boolean arr[] = new boolean[1];
        arr[0]=true;
         System.out.println(f(root,arr));
        return arr[0];
    }
    private int f(TreeNode root,boolean[] arr){
        if(root==null)
            return 0;
        
        int left = 1+f(root.left,arr);
        int right = 1+f(root.right,arr);
        if(Math.abs(left-right)>1){
            arr[0]=false;
        }
        return Math.max(left,right);
    }
    
}