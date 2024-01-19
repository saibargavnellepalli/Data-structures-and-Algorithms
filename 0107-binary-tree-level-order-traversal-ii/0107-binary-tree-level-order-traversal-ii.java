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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
       
        List<List<Integer>> ans = new ArrayList<>();
         Stack<List<Integer>> st = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
         if(root == null) return ans;
        
        q.offer(root);
        
        while(q.isEmpty() == false){
            
            int n = q.size();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i=1; i<=n; i++){
                
                TreeNode temp = q.poll();
                
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
                
                list.add(temp.val);
            }
            st.add(list);
        }
        
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
       
        
        return ans;
    }
}