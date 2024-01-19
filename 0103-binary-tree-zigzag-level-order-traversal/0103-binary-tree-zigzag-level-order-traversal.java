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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
          List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        boolean leftToright = true;
        
        while(q.isEmpty() == false){
            
            int n = q.size();
            
            List<Integer> list = new ArrayList<>();
            Stack<Integer> st = new Stack<>();
            
            for(int i=1; i<=n; i++){
                
                TreeNode temp = q.poll();
                
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
                
                if(leftToright == false){
                     st.push(temp.val);
                }
                else{
                list.add(temp.val);
                }
                
               
            }
            
            if(leftToright == false){
                
                while(st.isEmpty() == false){
                    list.add(st.pop());
                    
                }
                leftToright = true;
                ans.add(list);
            }
            else{
            
                ans.add(list);
                leftToright = false;
            }
        }
        
        
        
        return ans;
    }
}