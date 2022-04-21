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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> leaf1 = new ArrayList<Integer>();
        ArrayList<Integer> leaf2 = new ArrayList<Integer>();
        
        leafsOfTree(root1,leaf1);
        leafsOfTree(root2,leaf2);
        
        return leaf1.equals(leaf2);
        
        
        }
    public void leafsOfTree(TreeNode root, ArrayList<Integer> leaf){
        
         if(root == null){
          return;
        } 
        if(root.left == null && root.right == null){
            leaf.add(root.val);
        }
       
        
        leafsOfTree(root.left,leaf);
       leafsOfTree(root.right,leaf);
        return;
        
    }
}