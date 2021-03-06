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
        
        List<List<Integer>> outerList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root!=null)
            q.add(root);
        else
            return outerList;
        
        while(!q.isEmpty()){
            
            int x = 0;
             List<Integer> Innerlist = new ArrayList<>();
            
            int n = q.size();
           
                
                while(x<n){
                
                TreeNode temp = q.peek();
                Innerlist.add(temp.val);
                q.remove();
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);
                
                x++;
                
            }
            
            outerList.add(Innerlist);
        }
        return outerList;
    }
}