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
     
        List<Integer> list = new ArrayList<>();
        
        f(0,root, list);
        
        return list;
    }
    
    public void f(int level, TreeNode root, List<Integer> list){
        
        if(root == null) return;
        
        if(level >= list.size())
        list.add(root.val);
        
        f(level+1, root.right, list);
        f(level+1, root.left, list);
        
        return;
    }
}