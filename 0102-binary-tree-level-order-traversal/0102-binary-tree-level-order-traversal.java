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
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null)
            q.add(root);
        else
            return ans;
        
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp = q.remove();
                al.add(temp.val);
                
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                
            }
            ans.add(al);
        }
        
        return ans;
    }
}