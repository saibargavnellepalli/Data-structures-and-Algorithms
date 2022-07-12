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
    int currIndex = 1;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        
      f(root,k);
        return ans;
    
    }
    private void f(TreeNode root, int k){
      if(root == null)
            return;
        
        
    
        f(root.left,k);
        
        if(currIndex == k){
            ans = root.val;
            
        }
        currIndex +=1;
        
        f(root.right,k);
    
    return;
        
        
}
}