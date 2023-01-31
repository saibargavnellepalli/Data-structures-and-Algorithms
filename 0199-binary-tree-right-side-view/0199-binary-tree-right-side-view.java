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
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
        f(0,root,ans);
        return ans;
    }
    
    public void f(int l, TreeNode root, List<Integer> ans){
        if(root == null) return;
        
        if(l >= ans.size()) ans.add(root.val);
        
        f(l+1,root.right,ans);
        f(l+1,root.left,ans);
        
        return;
    }
}