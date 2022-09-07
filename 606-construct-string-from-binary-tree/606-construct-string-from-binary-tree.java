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
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        helper(t, sb);
        return sb.toString();
    }
    
    private void helper(TreeNode root, StringBuilder sb) {
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            return;
        }
        if (root.left != null) {
            sb.append("(");
            helper(root.left, sb);
            sb.append(")");
        }
        if (root.right != null) {
            if (root.left == null) {
                sb.append("()");
            }
            sb.append("(");
            helper(root.right, sb);
            sb.append(")");
        }
    }
}