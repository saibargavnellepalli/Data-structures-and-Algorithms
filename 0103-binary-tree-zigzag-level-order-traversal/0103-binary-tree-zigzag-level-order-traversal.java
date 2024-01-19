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
          List<List<Integer>> main = new ArrayList<>();
        
        if(root == null) return main;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        boolean leftToRight = true;
        
        while(!q.isEmpty()){
            
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            Stack<Integer> st = new Stack<>();
            
            for(int i=1; i<=n; i++){
                
                TreeNode elem = q.remove();
                
                
                if(leftToRight){
                list.add(elem.val);
                }
                else{
                    st.add(elem.val);
                }
                if(elem.left != null) q.add(elem.left);
                if(elem.right != null) q.add(elem.right);
                
              }
            
            if(leftToRight){
            
            main.add(list);
                
                leftToRight = false;
            }
            
            else{
                
                while(!st.isEmpty()){
                    list.add(st.pop());
                }
                
                main.add(list);
                
                leftToRight = true;
                
            }
            
        }
        
        return main;
    }
}