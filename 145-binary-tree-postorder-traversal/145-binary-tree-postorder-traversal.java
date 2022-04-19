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
    public List<Integer> postorderTraversal(TreeNode root) {
        
  ArrayList<Integer> list = new ArrayList<>();
        
         preOrder(root, list);
        return list;
    }
    public void preOrder(TreeNode root, ArrayList<Integer>list){
        
        if(root == null)
            return;
       
        preOrder(root.left,list);
        preOrder(root.right, list);
         list.add(root.val);
        
          
    }
                                       
                                      
                            
}