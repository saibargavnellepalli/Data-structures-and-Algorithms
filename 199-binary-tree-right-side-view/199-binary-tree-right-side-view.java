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
        
       /* ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(root!=null)
            list.add(root.val);
        
        helper(root,list);
        return list;
    }
    public void helper(TreeNode root,ArrayList<Integer> list){
        
        if (root == null)
            return;
        if(root.right == null && root.left==null)
            return;
        if(root.right == null && root.left!=null)
            list.add(root.left.val);
        
         if(root.right != null)
            list.add(root.right.val);
        helper(root.right,list);
        return;
        */
        
    ArrayList<Integer> list = new ArrayList<Integer>();
        
        rightView(root, 1, list);
       return list;
    }
    
    public void rightView(TreeNode root, int cl,  ArrayList<Integer> list){
        
        if(root == null){
            return;
        }
        
        
        
        //right view in left subtree
        if(cl> list.size()){
            list.add(root.val);
        }
        
        rightView(root.right, cl+1, list);
        rightView(root.left, cl+1, list);
        
        
    }
}