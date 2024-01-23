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
    public boolean isValidBST(TreeNode root) {
      List<Integer> li = new ArrayList<>();

        inorder(root, li);  

        for(int i = 1; i < li.size(); i++)
        {
            if(li.get(i) <= li.get(i - 1)){
                return false;
            }
        }  
        return true; 
    }
    public void inorder(TreeNode root, List<Integer> li){
        if(root == null) return;

        inorder(root.left, li);
        li.add(root.val);
        inorder(root.right, li);
    }   
    
}