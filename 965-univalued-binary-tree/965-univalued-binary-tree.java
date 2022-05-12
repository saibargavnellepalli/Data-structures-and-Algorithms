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
    public boolean isUnivalTree(TreeNode root) {
        
     if(root==null)
         return false;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
    //get the element which is in root, so that we can check this element with all other elements
        int elm = root.val;
        
        while(!q.isEmpty()){
            
            TreeNode temp = q.poll();
            
            if(temp.val!=elm)
                return false;
            
            if(temp.left!=null)
                q.add(temp.left);
            
            if(temp.right!=null)
                q.add(temp.right);
        }
        
        return true;
            
    }
}