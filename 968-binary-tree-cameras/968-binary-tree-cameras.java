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
   
    int ans = 0;
    public int minCameraCover(TreeNode root) {
      
       return f(root)==0?ans+1 : ans;
    }
    private int f(TreeNode root){
     
        if(root == null)
            return 1;
        int l = f(root.left);
        int r = f(root.right);
        
        if(l==0 || r==0){
            ans+=1;
            return 2;
        }
        if(l==2 || r==2){
            return 1;
        }
        else{
            return 0;
        }
       
        
        
        
    }
}