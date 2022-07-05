/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return f(root,p,q);
    }
    private TreeNode f(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)
            return null;
        if(root.val==p.val || root.val == q.val)
            return root;
        
        TreeNode left = f(root.left,p,q);
        TreeNode right = f(root.right,p,q);
        
        if(left == null)
            return right;
        if(right == null)
            return left;
        return root;
        
    }
}