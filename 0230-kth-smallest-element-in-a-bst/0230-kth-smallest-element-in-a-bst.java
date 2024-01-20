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
      
        List<Integer> list = new ArrayList<>();
        
        inorder(root, list);
        
        // kth smallest at (k-1) index in list
        return list.get(k-1);
    }
    
    public void inorder(TreeNode root, List<Integer> list){
        
        if(root == null) return;
        
        // inorder -> left, root, right
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        
    }
}