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
        

        
    ArrayList<Integer> list = new ArrayList<Integer>();
     rightView(root,0,list);
        return list;
        
    }
     public void rightView(TreeNode root, int cl,  ArrayList<Integer> list){
        
       if(root==null) return ;
         
         if(cl>=list.size())
         list.add(root.val);
         rightView(root.right,cl+1,list);
         rightView(root.left,cl+1,list);

         
         
        
    }
}