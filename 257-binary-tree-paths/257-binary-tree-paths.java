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
    public List<String> binaryTreePaths(TreeNode root) {
        
            ArrayList<String> al = new ArrayList<String>();
        
        String currPath = "";
        if(root!=null){
            currPath += root.val;
        }
        
        paths(root,currPath,al);
        
        return al;
    }
    
    public void paths(TreeNode root, String curr, ArrayList<String> list){
        
        if(root == null)
            return;
        
        //current node is leaf node
        if(root.left == null && root.right == null){
            list.add(curr);
            return;
        }
        
        if(root.left!=null){
           paths(root.left,curr+"->"+root.left.val,list); 
        }
        
          if(root.right!=null){
           paths(root.right,curr+"->"+root.right.val,list); 
        }
        
        return;
        
    }
}