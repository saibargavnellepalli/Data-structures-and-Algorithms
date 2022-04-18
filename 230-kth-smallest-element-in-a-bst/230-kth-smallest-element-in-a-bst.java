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
    public int kthSmallest(TreeNode root, int k) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        inorder(root,k,al);
        return al.get(k-1);
    }
    void inorder(TreeNode root,int k, ArrayList<Integer> al){
        
        if( root == null)
            return;
        inorder(root.left,k,al);
        al.add(root.val);
        inorder(root.right,k,al);
        
    }
}