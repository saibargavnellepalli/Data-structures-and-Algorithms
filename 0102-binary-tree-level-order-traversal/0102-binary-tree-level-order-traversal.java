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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> main = new ArrayList<>();
        
        if(root == null) return main;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=1; i<=n; i++){
                
                TreeNode elem = q.remove();
                
                list.add(elem.val);
                
                if(elem.left != null) q.add(elem.left);
                if(elem.right != null) q.add(elem.right);
                
              }
            
            main.add(list);
            
        }
        
        return main;
        
    }
}